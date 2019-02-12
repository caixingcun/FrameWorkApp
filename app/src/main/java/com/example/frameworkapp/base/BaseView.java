package com.example.frameworkapp.base;

/**
 * Created by jerry.guan on 2/28/2017.
 */

public interface BaseView {

    void dialogShow();
    void dialogShow(String message);
    void dialogShowFocus();
    void dialogShowFocus(String message);
    void dialogDissmiss();
}
