package com.example.jetictors.welfare.base.mvp

import io.reactivex.disposables.CompositeDisposable

/**
 * 描述    : presenter基类
 * author  : Jetictors
 * time    :  2017/11/1 15:18
 * version : v1.0.1
 */
open class BasePresenter<V : IBaseView> : IBasePresenter<V>{

    private var mView : V? = null

    private var mCompositeDisposable = CompositeDisposable()

    override fun attachView(mView: V) {
        this.mView = mView
    }

    override fun detachView() {
        mView = null

        //保证view结束时取消所有正在执行的订阅
        if (!mCompositeDisposable.isDisposed){
            mCompositeDisposable.clear()
        }
    }

    fun getV() : V{
        if (mView == null){
            throw MvpViewNotAttachedException()
        }

        return mView as V

    }

    private class MvpViewNotAttachedException internal constructor()
        : RuntimeException(" v can to be null !")

}
