package com.example.frameworkapp.ui;

import android.os.Bundle;

import com.example.frameworkapp.R;
import com.example.frameworkapp.base.BaseRxActivity;
import com.example.frameworkapp.bean.GankIoBean;
import com.example.frameworkapp.bean.ResponseBean;
import com.example.frameworkapp.net.ComposeToken;
import com.example.frameworkapp.net.HttpService;
import com.example.frameworkapp.net.MyDefaultObserver;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jakewharton.rxbinding2.view.RxView;

import java.util.List;
import java.util.concurrent.TimeUnit;


import io.reactivex.Observable;

public class MainActivity extends BaseRxActivity {
    private BaseRxActivity mActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        RxView.clicks(findViewById(R.id.tv))
                .throttleFirst(1, TimeUnit.SECONDS)
                .subscribe(o -> {
                    getData();
                })

        ;
    }

    private void getData() {
        Observable.just(1)
                .doOnSubscribe(d -> {
                    addDisposable(d);
                    dialogShowFocus();
                })
                .flatMap(i -> new HttpService<ResponseBean<ResponseBean<List<GankIoBean>>>>()
                        .get("http://gank.io/api/today",new TypeToken<ResponseBean<GankIoBean>>(){}.getType()))
                .compose(new ComposeToken(mActivity))
                .subscribe(new MyDefaultObserver<ResponseBean<GankIoBean>>(mActivity) {
                    @Override
                    public void onNext(ResponseBean<GankIoBean> listResponseBean) {
                        dialogDissmiss();
                        toast(new Gson().toJson(listResponseBean.results.getAndroid()));
                    }
                });
    }
}
