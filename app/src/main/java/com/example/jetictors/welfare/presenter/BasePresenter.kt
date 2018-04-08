package com.example.jetictors.welfare.presenter

import com.example.jetictors.welfare.base.mvp.BasePresenter
import com.example.jetictors.welfare.modle.net.HttpApi
import com.example.jetictors.welfare.presenter.contract.IContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * 描述    : 妹子页presenter
 * author  : Jetictors
 * time    :  2017/11/2 15:44
 * version : v1.0.1
 */
class BasePresenter : BasePresenter<IContract.IView>(), IContract.IPresenter{

    override fun getData(type: String, number: Int, page: Int) {
        HttpApi.apiService?.run {
            getGankData(type, number, page)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {success -> getV().getDataSuccess(success.results) },
                            {failed -> getV().getDataFailed(failed.message ?: "") }
                    )
        }
    }
}
