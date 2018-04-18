package com.example.silas.mvpdemo.presenter;

import com.example.silas.mvpdemo.modle.DingTestBean;

import java.util.List;

/**
 * Created by Silas on 2016/10/7.
 * presenter的接口，方法是处理数据
 */
public interface IBuyBookPresenter {

    List<DingTestBean> getAdapterData();
}
