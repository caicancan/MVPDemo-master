package com.example.silas.mvpdemo.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.silas.mvpdemo.presenter.BasePresenter;

/**
 * Created by Silas on 2016/10/7.
 */
public abstract class BaseActivity<T extends BasePresenter> extends Activity {
    
    protected T basepresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        //初始化代理着
        basepresenter = initPresent();
        onPrepare();
    }

    abstract T initPresent();

    abstract int getLayout();

    abstract void initView();

    abstract void onPrepare();
}
