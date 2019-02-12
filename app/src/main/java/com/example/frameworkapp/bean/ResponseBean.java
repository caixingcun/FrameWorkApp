package com.example.frameworkapp.bean;

import java.io.Serializable;

/**
 * Created by ccb on 2017/10/11.
 *
 */


public class ResponseBean<T> implements Serializable {

    public boolean error;
    public T results;

}