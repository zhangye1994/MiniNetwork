package com.example.mininetwork.net;

import com.example.mininetwork.bean.CityPickerBean;

import java.lang.reflect.Type;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface Api {
    @GET("a.json")
    public Observable<CityPickerBean> getUserInfo();

}
