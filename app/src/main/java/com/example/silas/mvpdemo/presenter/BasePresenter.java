package com.example.silas.mvpdemo.presenter;

import com.example.silas.mvpdemo.view.BaseActivity;

/**
 * Created by Silas on 2016/10/7.
 */
public abstract class BasePresenter<T extends BaseActivity> {

    abstract void initData();
}
