package com.example.silas.mvpdemo.presenter;

/**
 * Created by Silas on 2016/10/7.
 */
public interface ValueCallBack<T> {
    void onSuccess(T t);

    void onFail(String code);
}
