package com.example.frameworkapp.base;

import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.ImmersionFragment;

/**
 * 沉浸式 Fragment
 */
public class BaseFragment extends ImmersionFragment {

    @Override
    public void initImmersionBar() {
        ImmersionBar.with(this).init();
    }

}
