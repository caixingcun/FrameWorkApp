package com.example.frameworkapp.net;

import com.example.frameworkapp.base.BaseActivity;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class ComposeToken<T> implements ObservableTransformer<T, T> {
    private BaseActivity mActivity;

    public ComposeToken(BaseActivity activity) {
        mActivity = activity;
    }

    @Override
    public ObservableSource<T> apply(Observable<T> upstream) {
        return upstream.doOnSubscribe(disposable -> mActivity.addDisposable(disposable))
                .observeOn(AndroidSchedulers.mainThread());
    }
}
