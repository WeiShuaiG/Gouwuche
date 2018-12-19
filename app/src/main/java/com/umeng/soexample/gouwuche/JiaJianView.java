package com.umeng.soexample.gouwuche;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by W on 2018/12/17.
 */

public class JiaJianView extends LinearLayout implements View.OnClickListener {
    private TextView mAdd;
    private TextView mDelete;
    private TextView mNumber;
    private int mCount;
    public JiaJianView(Context context,AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.add_remove_view, this);
        initViews();
    }

    private void initViews() {
        mAdd = findViewById(R.id.add_tv);
        mDelete = findViewById(R.id.delete_tv);
        mNumber = findViewById(R.id.product_number_tv);
        mAdd.setOnClickListener(this);
        mDelete.setOnClickListener(this);
    }
    public void setNumber(int number){
        this.mCount = number;
        mNumber.setText(number+"");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.delete_tv:
                if (mCount>0){
                    mCount--;
                    mNumber.setText(mCount+"");
                    if (mCountChange!= null){
                        mCountChange.setCount(mCount);
                    }
                }else {
                    Toast.makeText(getContext(), "商品已售空", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.add_tv:
                    mCount++;
                    mNumber.setText(mCount+"");
                    if (mCountChange!= null){
                        mCountChange.setCount(mCount);
                    }
                    break;
        }
    }
    public interface onCountChange{
        void setCount(int count);
    }
    private onCountChange mCountChange;
    public void setOnChange(onCountChange countChange){
        this.mCountChange = countChange;
    }
}
