package com.example.silas.mvpdemo.modle;

import com.example.silas.mvpdemo.presenter.ValueCallBack;

import java.util.List;

/**
 * Created by Silas on 2016/10/7.
 * modle层，涉及到网络请求获取数据
 */

public interface IBuyBookModel {
    /**
     * 获取模拟数据，传入接口成功和失败两种情况
     */
    void getTestData(ValueCallBack<List<DingTestBean>> callBack);


    /**
     * 返回本地adapter数据
     * @return
     */
    List<DingTestBean> getAdapterData();
}
