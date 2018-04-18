package com.example.silas.mvpdemo.view;

import android.widget.ListView;
import android.widget.Toast;

import com.example.silas.mvpdemo.presenter.BuyBookPresenter;
import com.example.silas.mvpdemo.R;

/**
 *  Created by Silas on 2016/10/7.
 *  先是实现接口里面的三个方法
 *  获得presener（代理者）
 */
public class BuyBookActivity extends BaseActivity<BuyBookPresenter> implements IBuyBookView
{

    private ListView mListView;
    private MyAdapter mAdapter;

    @Override
    BuyBookPresenter initPresent()
    {
        //初始化得到presenter
        return new BuyBookPresenter(this);
    }

    @Override
    int getLayout()
    {
        return R.layout.activity_main;
    }

    @Override
    void initView()
    {

        mListView = (ListView) findViewById(R.id.listview);
    }

    @Override
    void onPrepare()
    {
        mAdapter = new MyAdapter(this, basepresenter.getAdapterData());
        mListView.setAdapter(mAdapter);
        //得到p
        basepresenter.initData();
    }

    @Override
    public void showToast(String msg)
    {

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void refreshAdapter()
    {

        mAdapter.notifyDataSetChanged();
    }

    public void onEmpty()
    {
        mListView.setEmptyView(null);
    }
}
