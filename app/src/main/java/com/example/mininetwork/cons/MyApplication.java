package com.example.mininetwork.cons;

import android.app.Application;

import com.example.mininetwork.net.RetrofitHelper;

public class MyApplication extends Application {
    public static Api api = null;
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitHelper.init("http://v.juhe.cn/");
        api = RetrofitHelper.create(Api.class);
    }

    /***有一个猜想哈，这么写可能会造成内存泄漏，因为App并没有被关闭，
     * 所以对象可能不会被回收，如果说静态api变量没有导致使用问题的话
     * 不推荐大家这样调用方法或者去写这样的方法*/
    public static Api getApi(){
        return RetrofitHelper.create(Api.class);
    }

}
