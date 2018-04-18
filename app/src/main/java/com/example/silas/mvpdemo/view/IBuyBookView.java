package com.example.silas.mvpdemo.view;

/**
 * Created by Silas on 2016/10/7.
 */
public interface IBuyBookView {
    //处理view的三个动作
    /**
     * 提示toast
     */
    void showToast(String msg);

    /**
     * 刷新adapter
     */
    void refreshAdapter();

    void onEmpty();
}
