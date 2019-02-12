package com.example.frameworkapp.util;

import android.widget.Toast;

import com.example.frameworkapp.global.App;


/**
 * Created by caixingcun on 2018/6/14.
 */

public class ToastUtil {
    private static Toast toast;
    public static void showToast(final String msg){
        if("main".equals(Thread.currentThread().getName())){
            Toast.makeText(App.getInstance(), msg, Toast.LENGTH_LONG).show();
        }else{
            App.sMainHandler.post(() -> {
                //这里主线程
                if(toast==null){
                    toast = Toast.makeText(App.getInstance(), msg, Toast.LENGTH_SHORT);
                }else {
                    toast.setText(msg);//如果不为空，则直接改变当前toast的文本
                }
                toast.show();
            });
        }
    }
}
