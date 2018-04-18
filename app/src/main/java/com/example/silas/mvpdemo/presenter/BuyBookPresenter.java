package com.example.silas.mvpdemo.presenter;

import android.util.Log;

import com.example.silas.mvpdemo.modle.DingTestBean;
import com.example.silas.mvpdemo.modle.IBuyBookModel;
import com.example.silas.mvpdemo.view.IBuyBookView;
import com.example.silas.mvpdemo.modle.BuyBookModel;
import com.example.silas.mvpdemo.view.BuyBookActivity;

import java.util.List;

/**
 * Created by Silas on 2016/10/7.
 */
public class BuyBookPresenter extends BasePresenter<BuyBookActivity> implements IBuyBookPresenter {

    private IBuyBookView mView;
    private IBuyBookModel mModel;
    //将接口传入代理者方便调用，方便接口回调
    public BuyBookPresenter(IBuyBookView iBuyBookView) {
        this.mView = iBuyBookView;
        this.mModel = new BuyBookModel();
    }

//1.先实现接口的方法，加载集合,调用modle里面的接口
    @Override
    public List<DingTestBean> getAdapterData() {
        return mModel.getAdapterData();
    }
//2.再实现继承的类的方法，在里面也调用接口的方法
    @Override
    public void initData() {
        //在这里弹出loading，调用modle的接口
        mModel.getTestData(new ValueCallBack<List<DingTestBean>>() {
            @Override
            public void onSuccess(List<DingTestBean> dingTestBeans) {
                //在这里取消loading
                //回调了以后再回调
                //简单数据操作可以在presenter里完成，接口回调，在view里面进行刷新界面
                Log.i("ccc","Presener"+dingTestBeans);
                mModel.getAdapterData().addAll(dingTestBeans);
                mView.refreshAdapter();
            }

            @Override
            public void onFail(String code) {
                //在这里取消loading，在view里面进行刷新界面
                mView.showToast(code);
                mView.onEmpty();
            }
        });
    }
}
