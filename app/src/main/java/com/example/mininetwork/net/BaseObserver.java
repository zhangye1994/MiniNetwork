package com.example.mininetwork.net;


import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import rx.Observer;


/**
 * Created by hp on 2017/12/22.
 */

public abstract class BaseObserver<T> implements Observer<T> {

    @Override
    public void onNext(T tResult) {
        onResult(tResult);
    }

    @Override
    public void onError(Throwable e) {
        if(e instanceof SocketTimeoutException){
            onError("连接超时");
            // onError(REQUEST_TIMEOUT,"连接超时");
        }else if(e instanceof UnknownHostException){
            //  onError(-3,"请检查网络");
            onError("请检查网络");
        }else if(e instanceof IllegalStateException){
            //  onError(REQUEST_ERROR,"数据解析失败");
            onError("数据解析失败");
        }else {
            //  onError(REQUEST_ERROR, e.getMessage());
            onError(e.getMessage());
        }

    }

    /**
     * 请求成功且返回码为0时回调
     * @param t
     */
    protected abstract void onResult(T t);

    /**
     * 请求失败或者返回码不为0时回调
     * @param s
     */
    protected abstract void onError(String s);


}
