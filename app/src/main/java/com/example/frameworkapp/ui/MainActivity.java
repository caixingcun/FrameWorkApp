package com.example.frameworkapp.ui;

import android.widget.TextView;

import com.example.frameworkapp.R;
import com.example.frameworkapp.base.BaseActivity;
import com.example.frameworkapp.bean.GankIoBean;
import com.example.frameworkapp.bean.ResponseBean;
import com.example.frameworkapp.net.ComposeToken;
import com.example.frameworkapp.net.HttpService;
import com.example.frameworkapp.net.MyDefaultObserver;
import com.example.frameworkapp.util.InjectLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observable;

@InjectLayout(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @Override
    protected void initView() {
        mTvTitle.setText("首页");

    }

    @Override
    protected void initDatas() {

    }


    private void getData() {
        Observable.just(1)
                .doOnSubscribe(d -> {
                    addDisposable(d);
                    dialogShowFocus();
                })
                .flatMap(i -> new HttpService<ResponseBean<ResponseBean<List<GankIoBean>>>>()
                        .get("http://gank.io/api/today", new TypeToken<ResponseBean<GankIoBean>>() {
                        }.getType()))
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
