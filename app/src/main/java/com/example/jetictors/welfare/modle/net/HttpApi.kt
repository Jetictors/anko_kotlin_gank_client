package com.example.jetictors.welfare.modle.net

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 描述    : 网络请求相关
 * author  : Jetictors
 * time    :  2017/11/3 14:35
 * version : v1.0.1
 */
class HttpApi{

    val BASE_URL = "http://gank.io/api/"

    fun getService() : GankService{
        val retrofit : Retrofit =  Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        return retrofit.create(GankService::class.java)
    }

}