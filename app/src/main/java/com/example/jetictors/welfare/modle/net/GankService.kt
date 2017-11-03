package com.example.jetictors.welfare.modle.net

import com.example.jetictors.welfare.modle.bean.BaseBean
import com.example.jetictors.welfare.modle.bean.JsonResult
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * 描述    : 接口服务类
 * author  : Jetictors
 * time    :  2017/11/3 13:18
 * version : v1.0.1
 */
interface GankService{

    @GET("data/{type}/{number}/{page}")
    fun getGankData(@Path("type") type : String
                    ,@Path("number") number : Int
                    ,@Path("page") page: Int) : Flowable<BaseBean<MutableList<JsonResult>>>

}