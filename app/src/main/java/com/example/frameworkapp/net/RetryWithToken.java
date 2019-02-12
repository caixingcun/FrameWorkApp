package com.example.frameworkapp.net;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;


/**
 * token 过期重试
 */
public class RetryWithToken implements Function<Observable<Throwable>, ObservableSource<?>> {
    final int retryTimes = 3;
    int current = 0;

    @Override
    public ObservableSource<?> apply(Observable<Throwable> throwableObservable) {
        // 请求网络 存储token
        // 重新刷新网络队列
        // 判断次数 抛异常/继续请求
        return throwableObservable.flatMap(new Function<Throwable, ObservableSource<?>>() {
            @Override
            public ObservableSource<?> apply(@NonNull Throwable throwable) throws Exception {

//                if (throwable instanceof MyException) {
//                    BaseResponseBean errorBean = ((MyException) throwable).getErrorBean();
//                    if (errorBean.status == 12110 && ++current <= retryTimes) {
//                        return OkGo.<ResponseBean<SpLogin>>post(AddressManager.get("sp_host") + SpConstans.LOGIN_URL)
//                                .params(SpConstans.KEY_ACCOUNT, SpConstans.ACCOUNT_TEMPLATE)
//                                .params(SpConstans.KEY_PWD, SpConstans.PWD_TEMPLATE)
//                                .params(SpConstans.KEY_CUSTOMER_NO, UserInfoModel.getInstance().getUser().getCertification())
//                                .converter(new JsonConvert<ResponseBean<SpLogin>>(new TypeToken<ResponseBean<SpLogin>>() {
//                                }.getType()))
//                                .adapt(new ObservableBody<ResponseBean<SpLogin>>())
//                                .subscribeOn(Schedulers.io())
//                                .observeOn(AndroidSchedulers.mainThread())
//                                .unsubscribeOn(Schedulers.io())
//                                .doOnNext(new Consumer<ResponseBean<SpLogin>>() {
//                                    @Override
//                                    public void accept(ResponseBean<SpLogin> spLoginResponseBean) throws Exception {
//                                        SharedPreferenceService.getInstance().put(SpConstans.SP_TOKRN, spLoginResponseBean.data.getToken());
//                                    }
//                                });
//                    } else {
//                        return Observable.error(throwable);
//                    }
//                    // 如果上面检测到token过期就会进入到这里
//                    // 然后下面的方法就是更新token
//                }
                // 如果是其他错误则会调用到observer的onError方法中
                return Observable.error(throwable);
            }
        });

    }
}

