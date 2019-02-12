package com.example.frameworkapp.net;

import android.widget.Toast;

import com.example.frameworkapp.base.BaseRxActivity;
import com.example.frameworkapp.bean.BaseResponseBean;
import com.example.frameworkapp.bean.ResponseBean;
import com.example.frameworkapp.enmu.ExceptionReason;
import com.example.frameworkapp.exception.MyException;
import com.example.frameworkapp.util.LogUtils;
import com.example.frameworkapp.util.ToastUtil;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.lzy.okgo.exception.HttpException;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by caixingcun on 2018/3/22.
 * 封装的 Observer 处理了 各种返回异常
 */

public abstract class MyDefaultObserver<T extends ResponseBean> implements Observer<T> {

    //  Activity 是否在执行onStop()时取消订阅
    private boolean isAddInStop = false;
    private BaseRxActivity activity;
    public MyDefaultObserver(BaseRxActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onSubscribe(Disposable d) {
        activity.addDisposable(d);
    }


    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        if (activity != null) {
            activity.dialogDissmiss();
        }

        LogUtils.error(e.getMessage());

        if (e instanceof HttpException) {     //   HTTP错误
            onException(ExceptionReason.BAD_NETWORK);
        } else if (e instanceof ConnectException
                || e instanceof UnknownHostException) {   //   连接错误
            onException(ExceptionReason.CONNECT_ERROR);
        } else if (e instanceof InterruptedIOException) {   //  连接超时
            onException(ExceptionReason.CONNECT_TIMEOUT);
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {   //  解析错误
            onException(ExceptionReason.PARSE_ERROR);
        } else if (e instanceof MyException) {
            handleErrorCode(e); //后台返回错误信息
        } else {
            onException(ExceptionReason.UNKNOWN_ERROR);
        }
    }

    /**
     * 处理后台 错误code
     *
     * @param e  异常
     */
    private void handleErrorCode(Throwable e) {
        BaseResponseBean errorBean = ((MyException) e).getErrorBean();
        LogUtils.debug(e.toString());
        ToastUtil.showToast("出错了123");
    }

    /**
     * 请求 网络/解析异常 处理
     *
     * @param reason  网络请求失败原因
     */
    private void onException(ExceptionReason reason) {
        switch (reason) {
            case CONNECT_ERROR:
                ToastUtil.showToast("网络连接失败");
                break;

            case CONNECT_TIMEOUT:
                ToastUtil.showToast("网络连接超时");
                break;

            case BAD_NETWORK:
                ToastUtil.showToast("网络异常");
                break;

            case PARSE_ERROR:
                ToastUtil.showToast("数据异常");
                break;
            case UNKNOWN_ERROR:
            default:
                ToastUtil.showToast("未知错误");
                break;
        }
    }
}
