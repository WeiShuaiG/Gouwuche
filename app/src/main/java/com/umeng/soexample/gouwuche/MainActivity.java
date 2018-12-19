package com.umeng.soexample.gouwuche;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.umeng.soexample.gouwuche.bean.MyData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private CheckBox Check_All;
    private TextView All_Price;
    private TextView Go_To_JS;
    private ExpandableListView Expand_View;
    private List<MyData.DataBean> mList = new ArrayList<>();
    private String mUrl = "http://www.wanandroid.com/tools/mockapi/6523/restaurant-list";
    private MyAdapter mAdapter;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            String jsonStr = (String) msg.obj;
            Gson gson = new Gson();
            MyData myData = gson.fromJson(jsonStr,MyData.class);
            mList.addAll(myData.getData());
            mAdapter.notifyDataSetChanged();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mAdapter = new MyAdapter(mList,this);
        Expand_View.setAdapter(mAdapter);
        List<MyData.DataBean> list = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            Expand_View.expandGroup(i);
        }
        getNetData();
        mAdapter.setCallback(new MyAdapter.AdapterCallback() {
            @Override
            public void setGroupCheck(int groupPosition) {
                boolean childAllCheck = mAdapter.isChildAllCheck(groupPosition);
                mAdapter.childAllCheck(groupPosition,!childAllCheck);
                mAdapter.notifyDataSetChanged();
                flushBottomLayout();
            }

            @Override
            public void setChildCheck(int groupPosition, int childPosition) {
                boolean childAllCheck = mAdapter.isChildChecked(groupPosition,childPosition);
                mAdapter.setChildCheck(groupPosition,childPosition,!childAllCheck);
                mAdapter.notifyDataSetChanged();

                flushBottomLayout();
            }

            @Override
            public void setNumber(int groupPositon, int childPosition, int number) {
                mAdapter.setShangPingNumber(groupPositon,childPosition,number);
                mAdapter.notifyDataSetChanged();
                flushBottomLayout();
            }
        });
        Check_All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean allGoods = mAdapter.isAllGoods();
                mAdapter.setAllGoodsIsChecked(!allGoods);
                mAdapter.notifyDataSetChanged();
                flushBottomLayout();
            }
        });
    }




    private void initView() {
        Check_All = (CheckBox) findViewById(R.id.check_All);
        All_Price = (TextView) findViewById(R.id.All_price);
        Go_To_JS = (TextView) findViewById(R.id.go_to_js);
        Expand_View = (ExpandableListView) findViewById(R.id.Expand_view);
        //去掉自带的小箭头
        Expand_View.setGroupIndicator(null);
    }
    private void getNetData() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(mUrl).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                handler.sendMessage(handler.obtainMessage(0,response.body().string()));
            }
        });

    }
    private void flushBottomLayout() {
        boolean allGoods = mAdapter.isAllGoods();
        Check_All.setChecked(allGoods);
        float allGoodsPrice = mAdapter.getAllGoodsPrice();
        int allGoodsNumber = mAdapter.getAllGoodsNumber();
        All_Price.setText("价格："+allGoodsPrice);
        Go_To_JS.setText("去结算（"+allGoodsNumber+")");
    }

}
