package com.example.mininetwork;

import android.app.Application;

import com.example.mininetwork.net.Api;
import com.example.mininetwork.net.RetrofitHelper;

public class MyApplication extends Application {
    public static Api api = null;
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitHelper.init("\\\\DESKTOP-E0P36UP\\shares\\");
        api = RetrofitHelper.create(Api.class);
    }
}
