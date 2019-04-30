/**
 * 基类activity封装
 */
package com.guibi.base.basic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        init_view();
    }


    // 设置布局
    public abstract int getLayoutId();
    // 初始布局
    public abstract void init_view ();
    // 初始化后数据
    public abstract void init_data ();

}
