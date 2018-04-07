package com.example.jetictors.welfare.base.mvp

/**
 * 描述    : presenter层基类接口
 * author  : Jetictors
 * time    :  2017/11/3 10:10
 * version : v1.0.1
 */
interface IBasePresenter<in V : IBaseView> {

    fun attachView(mView : V)

    fun detachView()

}