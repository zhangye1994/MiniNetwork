package com.example.mininetwork.net;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper<T> {
    private T t;
    private static Retrofit retrofit ;
    private static OkHttpClient.Builder okHttpClient;

    //由系统初始化
    public static void init(String baserUrl){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .client(openLogger().build())
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(baserUrl)
                    .build();
            openLogger();
        }
    }

    public static <T> T create(Class<T> t){
        return retrofit.create(t);
    }

    public static OkHttpClient.Builder openLogger(){
        //声明日志类
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        //设定日志级别
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //自定义OkHttpClient
             okHttpClient = new OkHttpClient.Builder();
        //添加拦截器
            okHttpClient.addInterceptor(httpLoggingInterceptor);
            return  okHttpClient;
    }
}
