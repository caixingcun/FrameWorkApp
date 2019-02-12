package com.example.frameworkapp.base;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;

import com.example.frameworkapp.util.ToastUtil;
import com.example.frameworkapp.widget.CustomProgress;
import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.OSUtils;


/**
 *
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {
    protected CustomProgress progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 所有子类都将继承这些相同的属性,请在设置界面之后设置
        ImmersionBar.with(this).init();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 必须调用该方法，防止内存泄漏
        ImmersionBar.with(this).destroy();
    }

    /**
     *   无文字 请稍等
     */
    @Override
    public void dialogShow() {
        if (progressDialog == null) {
            progressDialog = CustomProgress.build(this, null);
            progressDialog.show();
        }
    }

    /**
     * 设置不可通过 返回按钮取消的 dialog   强制性 不可取消
     */
    @Override
    public void dialogShowFocus() {
        if (progressDialog == null || !progressDialog.isShowing()) {
            progressDialog = CustomProgress.build(this, null);
            progressDialog.show();
            progressDialog.setOnKeyListener((dialog, keyCode, event) -> {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    return true;
                }
                return false;
            });
        }
    }

    @Override
    public void dialogShow(String value) {
        if (progressDialog == null || !progressDialog.isShowing()) {
            progressDialog = CustomProgress.build(this, value);
            progressDialog.show();
        }
    }

    /**
     * 设置不可通过 返回按钮取消的 dialog
     * @param value   dialog展示文字  强制性 不可取消
     */
    @Override
    public void dialogShowFocus(String value) {
        if (progressDialog == null || !progressDialog.isShowing()) {
            progressDialog = CustomProgress.build(this, value);
            progressDialog.show();
            progressDialog.setOnKeyListener((dialog, keyCode, event) -> {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    return true;
                }
                return false;
            });
        }
    }

    @Override
    public void dialogDissmiss() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

    public void toast(String msg) {
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        ToastUtil.showToast(msg);
    }
}
