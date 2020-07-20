package com.example.mininetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mininetwork.bean.CityPickerBean
import com.example.mininetwork.net.BaseObserver
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication.api.getUserInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : BaseObserver<CityPickerBean>(){

                override fun onResult(t: CityPickerBean?) {
                    Log.e("zhangyehttp","返回了数据")
                }

                override fun onError(s: String?) {
                        Log.e("zhangyehttp","s="+s)
                }

                override fun onCompleted() {
                        Log.e("zhangyehttp","完成请求")

                }

            });
    }
}