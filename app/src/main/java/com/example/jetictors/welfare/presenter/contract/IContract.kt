package com.example.jetictors.welfare.presenter.contract

import com.example.jetictors.welfare.base.mvp.IBasePresenter
import com.example.jetictors.welfare.base.mvp.IBaseView
import com.example.jetictors.welfare.modle.bean.JsonResult

/**
 * 描述    : girl页面契约类
 * author  : Jetictors
 * time    :  2017/11/2 13:19
 * version : v1.0.1
 */
interface IContract {

    interface IView : IBaseView {

        fun getDataSuccess(mData : MutableList<JsonResult>)

        fun getDataFailed(message : String)
    }

    interface IPresenter : IBasePresenter<IView> {

        fun getData(type : String, number : Int, page : Int)

    }
}