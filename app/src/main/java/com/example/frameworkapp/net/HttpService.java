package com.example.frameworkapp.net;

import com.lzy.okgo.OkGo;
import com.lzy.okrx2.adapter.ObservableBody;

import java.lang.reflect.Type;
import java.util.Map;

import io.reactivex.Observable;


public class HttpService<T> {

    public Observable<T> get(String url,Type type) {
        return OkGo.<T>get(url)
                .converter(new JsonConvert<>(type))
                .adapt(new ObservableBody<>());
    }

    public Observable<T> post(String url, Map<String,String> bodyMap, Type type) {
        return OkGo.<T>post(url)
                .params(bodyMap)
                .converter(new JsonConvert<>(type))
                .adapt(new ObservableBody<>());
    }
}
