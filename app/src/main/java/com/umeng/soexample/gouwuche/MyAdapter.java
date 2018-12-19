package com.umeng.soexample.gouwuche;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.umeng.soexample.gouwuche.bean.MyData;

import java.util.List;

/**
 * Created by W on 2018/12/17.
 */

public class MyAdapter extends BaseExpandableListAdapter {
    private List<MyData.DataBean> list;
    private Context context;

    public MyAdapter(List<MyData.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return list.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return list.get(i).getSpus().size();
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(final int i, boolean b, View view, ViewGroup viewGroup) {
        GroupHolder groupHolder = null;
        if (view == null){
            groupHolder = new GroupHolder();
            view = View.inflate(context,R.layout.group_list,null);
            groupHolder.mGroupCheck = view.findViewById(R.id.group_cb);
            groupHolder.mGroupTv = view.findViewById(R.id.group_name);
            view.setTag(groupHolder);
        }else{
            groupHolder = (GroupHolder) view.getTag();
        }
        MyData.DataBean dataBean = list.get(i);
        groupHolder.mGroupTv.setText(dataBean.getName()+"");
        boolean childAllCheck = isChildAllCheck(i);
        groupHolder.mGroupCheck.setChecked(childAllCheck);
        groupHolder.mGroupCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (adapterCallback!= null){
                    adapterCallback.setGroupCheck(i);
                }
            }
        });
        return view;
    }

    @Override
    public View getChildView(final int i, final int i1, boolean b, View view, ViewGroup viewGroup) {
        ChildHolder childHolder = null;
        if (view == null){
            childHolder = new ChildHolder();
            view = View.inflate(context,R.layout.child_item,null);
            childHolder.mChildTitle = view.findViewById(R.id.chile_title);
            childHolder.mChildPrice = view.findViewById(R.id.chile_price);
            childHolder.mChildCheck = view.findViewById(R.id.child_check);
            childHolder.mImage = view.findViewById(R.id.child_icon);
            childHolder.jiaJianView = view.findViewById(R.id.jia_jian_view);
            view.setTag(childHolder);
        }else {
            childHolder = (ChildHolder) view.getTag();
        }
        MyData.DataBean.SpusBean spusBean = list.get(i).getSpus().get(i1);
        Glide.with(context).load(spusBean.getPic_url()).into(childHolder.mImage);
        childHolder.mChildTitle.setText(spusBean.getName()+"");
        childHolder.mChildPrice.setText(spusBean.getSkus().get(0).getPrice()+"");
        childHolder.mChildCheck.setChecked(spusBean.isChildChecked());
        childHolder.jiaJianView.setNumber(spusBean.getPraise_num());
        childHolder.mChildCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (adapterCallback!= null){
                    adapterCallback.setChildCheck(i,i1);
                }
            }
        });
        childHolder.jiaJianView.setOnChange(new JiaJianView.onCountChange() {
            @Override
            public void setCount(int count) {
                if (adapterCallback != null) {
                    adapterCallback.setNumber(i, i1, count);
                }
            }
        });

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
    class GroupHolder{
        private CheckBox mGroupCheck;
        private TextView mGroupTv;
    }
    class ChildHolder{
        private CheckBox mChildCheck;
        private TextView mChildTitle;
        private ImageView mImage;
        private TextView mChildPrice;
        private JiaJianView jiaJianView;
    }

    //点击group的CheckBox让所有child选中
    public void childAllCheck(int groupPosition,boolean isCheck){
        MyData.DataBean dataBean = list.get(groupPosition);
        List<MyData.DataBean.SpusBean> spus = dataBean.getSpus();
        for (int i = 0;i<spus.size();i++){
            MyData.DataBean.SpusBean bean = spus.get(i);
            bean.setChildChecked(isCheck);
        }
    }
    //用来判断小组是否全被选中
    public boolean isChildAllCheck(int groupPosition){
        boolean boo = true;
        MyData.DataBean dataBean = list.get(groupPosition);
        List<MyData.DataBean.SpusBean> spus = dataBean.getSpus();
        for (int i = 0; i < spus.size(); i++) {
            MyData.DataBean.SpusBean bean = spus.get(i);
            //只要有一个没有被选中 点这个CheckBox就是全选的功能
            if (!bean.isChildChecked()) {
                return false;
            }
        }
        return boo;
    }
    //点击child给他进行赋值
    public void setChildCheck(int groupPosition,int childPosition,boolean isCheckBox){
        MyData.DataBean.SpusBean spusBean = list.get(groupPosition).getSpus().get(childPosition);
        spusBean.setChildChecked(isCheckBox);
    }
    //查看当前这个商品有没有被选中
    public boolean isChildChecked(int groupPositon,int childPosition){
        MyData.DataBean.SpusBean spusBean = list.get(groupPositon).getSpus().get(childPosition);
        if (spusBean.isChildChecked()){
            return true;
        }
        return false;
    }
    //给商品数量进行赋值
    public void setShangPingNumber(int groupPosition,int childPosition,int number){
        MyData.DataBean.SpusBean spusBean = list.get(groupPosition).getSpus().get(childPosition);
        spusBean.setPraise_num(number);

    }
    //因为咱们底部视图有个一全选和反选
    public boolean isAllGoods(){
        boolean boo = true;
        for (int i = 0; i <list.size() ; i++) {
            MyData.DataBean dataBean = list.get(i);
            for (int j = 0; j <dataBean.getSpus().size() ; j++) {
                MyData.DataBean.SpusBean spusBean = dataBean.getSpus().get(j);
                if (!spusBean.isChildChecked()){
                    boo = false;
                }
            }
        }
        return boo;
    }
    //全选反选功能
    public void setAllGoodsIsChecked(boolean isAllCheck){
        for (int i = 0; i <list.size() ; i++) {
            MyData.DataBean dataBean = list.get(i);
            for (int j = 0; j <dataBean.getSpus().size() ; j++) {
                MyData.DataBean.SpusBean spusBean = dataBean.getSpus().get(j);
                spusBean.setChildChecked(isAllCheck);
            }

        }
    }
    //计算所有商品的价格
    public float getAllGoodsPrice(){
        float allPrice = 0;
        for (int i = 0; i <list.size() ; i++) {
            MyData.DataBean dataBean = list.get(i);
            for (int j = 0; j <dataBean.getSpus().size() ; j++) {
                MyData.DataBean.SpusBean spusBean = dataBean.getSpus().get(j);
                if (spusBean.isChildChecked()){
                    allPrice = allPrice+spusBean.getPraise_num() * Float.parseFloat(spusBean.getSkus().get(0).getPrice());
                }
            }
        }
        return allPrice;
    }
    //计算所有商品的数量
    public int getAllGoodsNumber(){
        int allNumber = 0;
        for (int i = 0; i <list.size() ; i++) {
            MyData.DataBean dataBean = list.get(i);
            for (int j = 0; j <dataBean.getSpus().size() ; j++) {
                MyData.DataBean.SpusBean spusBean = dataBean.getSpus().get(j);
                if (spusBean.isChildChecked()){
                    allNumber = allNumber + spusBean.getPraise_num();
                }
            }
        }
        return allNumber;
    }
    public interface AdapterCallback {
        void setGroupCheck(int groupPosition);

        void setChildCheck(int groupPosition, int childPosition);

        //点击加减按钮刷新
        void setNumber(int groupPosition, int childPosition, int number);

    }

    private AdapterCallback adapterCallback;

    public void setCallback(AdapterCallback adapterCallback) {
        this.adapterCallback = adapterCallback;
    }

}
