package com.example.jetictors.welfare.presenter.contract

import com.example.jetictors.welfare.base.mvp.IBasePresenter
import com.example.jetictors.welfare.base.mvp.IBaseView
import com.example.jetictors.welfare.modle.bean.BaseBean
import com.example.jetictors.welfare.modle.bean.JsonResult
import io.reactivex.Flowable

/**
 * 描述    : girl页面契约类
 * author  : Jetictors
 * time    :  2017/11/2 13:19
 * version : v1.0.1
 */
interface IGirlContract{

    interface IGirlView : IBaseView {

        fun getGirlDataSuccess(mData : MutableList<JsonResult>)

        fun getGirlDataFailed(message : String)
    }

    interface IGirlPresenter {

        fun getGirlData(type : String, number : Int, page : Int)

    }
}