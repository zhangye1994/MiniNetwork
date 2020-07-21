package com.example.mininetwork.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mininetwork.cons.MyApplication
import com.example.mininetwork.R
import com.example.mininetwork.bean.WeatherBean
import com.example.mininetwork.net.BaseObserver
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        MyApplication.api.getUserInfo(URLEncoder.encode("苏州","utf-8"),"b3c52fb7413656e94332f8fc50fdcb1b",null,null)
        MyApplication.api.getUrl("http://v.juhe.cn/weather/index",URLEncoder.encode("苏州","utf-8"),"b3c52fb7413656e94332f8fc50fdcb1b",null,null)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : BaseObserver<WeatherBean>(){

                override fun onResult(t: WeatherBean?) {
                    Log.e("zhangyehttp","返回了数据")
                    tv_content.text = Gson().toJson(t)
                }

                override fun onError(s: String?) {
                        Log.e("zhangyehttp","s="+s)
                    tv_content.text = s
                }

                override fun onCompleted() {
                        Log.e("zhangyehttp","完成请求")

                }

            });
    }
}