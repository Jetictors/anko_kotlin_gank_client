package com.example.jetictors.welfare.modle.net

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * 描述    : 网络请求相关
 * author  : Jetictors
 * time    :  2017/11/3 14:35
 * version : v1.0.1
 */
object HttpApi {

    private val BASE_URL = "http://gank.io/api/"

    private var mClient: OkHttpClient? = null
    private var mRetrofit: Retrofit? = null

    val apiService: GankService? by lazy { mRetrofit?.create(GankService::class.java) }

    init {

        val httpLogger = HttpLoggingInterceptor()
        httpLogger.level = HttpLoggingInterceptor.Level.BODY

        mClient = OkHttpClient.Builder()
                .addInterceptor(httpLogger)
                .connectTimeout(30L, TimeUnit.SECONDS)
                .readTimeout(30L, TimeUnit.SECONDS)
                .writeTimeout(30L, TimeUnit.SECONDS)
                .build()

        mClient?.run {
            mRetrofit = Retrofit.Builder()
                    .client(this)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
        }

    }
}