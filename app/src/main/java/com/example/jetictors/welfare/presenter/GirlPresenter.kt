package com.example.jetictors.welfare.presenter

import android.util.Log
import com.example.jetictors.welfare.modle.net.HttpApi
import com.example.jetictors.welfare.presenter.contract.IGirlContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * 描述    : 妹子页presenter
 * author  : Jetictors
 * time    :  2017/11/2 15:44
 * version : v1.0.1
 */
class GirlPresenter(val girlView : IGirlContract.IGirlView) : IGirlContract.IGirlPresenter{

    init {
        girlView.presenter = this
    }

    override fun start() {
    }

    override fun getGirlData(type: String, number: Int, page: Int) {

        HttpApi().getService().getGankData(type, number, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    result ->
                        if (result.result == null || result.result.size == 0){
                            Log.e("GirlTag","result is null")
                        } else{
                            girlView.getGirlDataSuccess(mData = result.result)
                        }
                    },{
                    e -> Log.e("GirlTag","OnError执行")
                })
    }
}
