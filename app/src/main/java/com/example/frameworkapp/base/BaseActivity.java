package com.example.frameworkapp.base;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

import com.example.frameworkapp.R;
import com.example.frameworkapp.util.LayoutInjectUtil;
import com.example.frameworkapp.util.LogUtils;
import com.example.frameworkapp.util.ToastUtil;
import com.example.frameworkapp.widget.CustomProgress;
import com.gyf.barlibrary.ImmersionBar;

import butterknife.ButterKnife;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


/**
 *
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {
    protected CustomProgress progressDialog;
    protected Toolbar mToolbar;
    protected BaseActivity mActivity;
    private CompositeDisposable mCompositeDisposable;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LayoutInjectUtil.getInjectLayoutId(this));
        ButterKnife.bind(this);
        mActivity = this;
        initToolbars();
        // 所有子类都将继承这些相同的属性,请在设置界面之后设置
        ImmersionBar.with(this).statusBarColor(R.color.colorPrimary).init();
        initView();
        initDatas();
        LogUtils.debug("当前界面名称 "+getClass().getCanonicalName());
    }

    protected abstract void initDatas();

    protected abstract void initView();

    protected void initToolbars() {
        View view = findViewById(R.id.toolbar);
        if (view != null) {
            mToolbar = (Toolbar) view;
            mToolbar.setTitle("");
            mToolbar.setSubtitle("");
            mToolbar.setLogo(null);
            //去除内间距
            mToolbar.setContentInsetsAbsolute(0, 0);
            //getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            setSupportActionBar(mToolbar);

        }
    }

    public void addDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    public void dispose() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 必须调用该方法，防止内存泄漏
        ImmersionBar.with(this).destroy();
        dispose();
    }

    /**
     * 无文字 请稍等
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
     *
     * @param value dialog展示文字  强制性 不可取消
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
