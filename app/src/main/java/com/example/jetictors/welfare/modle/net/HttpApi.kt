package com.example.jetictors.welfare.modle.net

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.*
import java.util.concurrent.TimeUnit

/**
 * 描述    : 网络请求相关
 * author  : Jetictors
 * time    :  2017/11/3 14:35
 * version : v1.0.1
 */
object HttpApi {

    val BASE_URL = "http://gank.io/api/"

    private var client: OkHttpClient? = null
    private var retrofit: Retrofit? = null

    val service: GankService? by lazy { getRetrofit()?.create(GankService::class.java) }

    /**
     * 设置公共参数
     */
    private fun addQueryParameterInterceptor(): Interceptor {
        return Interceptor { chain ->
            val originalRequest = chain.request()
            val request: Request
            val modifiedUrl = originalRequest.url().newBuilder()
                    .build()
            request = originalRequest.newBuilder().url(modifiedUrl).build()
            chain.proceed(request)
        }
    }

    /**
     * 设置头
     */
    private fun addHeaderInterceptor(): Interceptor {
        return Interceptor { chain ->
            val originalRequest = chain.request()
            val requestBuilder = originalRequest.newBuilder()
                    .method(originalRequest.method(), originalRequest.body())
            val request = requestBuilder.build()
            chain.proceed(request)
        }
    }

    private fun getRetrofit(): Retrofit? {
        if (retrofit == null) {
            synchronized(HttpApi::class.java) {
                if (retrofit == null) {

                    client = OkHttpClient.Builder()
                            .addInterceptor(addQueryParameterInterceptor())  //参数添加
                            .addInterceptor(addHeaderInterceptor()) // token过滤
                            .connectTimeout(60L, TimeUnit.SECONDS)
                            .readTimeout(60L, TimeUnit.SECONDS)
                            .writeTimeout(60L, TimeUnit.SECONDS)
                            .build()

                    // 获取retrofit的实例
                    retrofit = Retrofit.Builder()
                            .baseUrl(BASE_URL)  //自己配置
                            .client(client!!)
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                }
            }
        }
        return retrofit
    }
}