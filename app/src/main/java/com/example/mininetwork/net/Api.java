package com.example.mininetwork.net;

import com.example.mininetwork.bean.WeatherBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

public interface Api {
    /**
     * 这两种方式请求到的数据实际上一模一样，
     * 一种是固定的BaseUrl
     * 一种是你自定义完整的请求路径，
     * 也就不需要像网上那样做拦截器
     * 而且也看过那个拦截器的获取方式，并不推荐给请求头添加无关的参数
     * 这一块如何拼接完全由用户自定义即可，有兴趣的也可以去试着做拦截器，并不复杂*/
    @GET("weather/index")
    public Observable<WeatherBean> getUserInfo(@Query(value = "cityname", encoded = true) String cityname, @Query("key") String key, @Query("dtype") String dtype, @Query("format") String format);

    @GET
    public Observable<WeatherBean> getUrl(@Url String path,@Query(value = "cityname", encoded = true) String cityname, @Query("key") String key, @Query("dtype") String dtype, @Query("format") String format);

}
