package com.example.jetictors.welfare.view.views.home.girl

import android.annotation.SuppressLint
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.constant.ConstantIds
import com.example.jetictors.welfare.modle.bean.JsonResult
import com.example.jetictors.welfare.presenter.GirlPresenter
import com.example.jetictors.welfare.presenter.contract.IGirlContract
import com.example.jetictors.welfare.view.UI.GirlUI
import com.example.jetictors.welfare.view.adapter.GirlAdapter
import org.jetbrains.anko.support.v4.find
import org.jetbrains.anko.support.v4.toast

/**
 * 描述    : 妹子fragment
 * author  : Jetictors
 * time    :  2017/10/30 14:38
 * version : v1.0.1
 */
class GirlFragment @SuppressLint("ValidFragment")
private constructor() : BaseFragment<GirlUI,GirlFragment>(),IGirlContract.IGirlView{

    override var presenter: IGirlContract.IGirlPresenter
        get() = GirlPresenter(this)
        set(value) {}

    lateinit var mGirlRv : RecyclerView
    lateinit var mData : MutableList<JsonResult>

    override fun getAnkoUI(): GirlUI {
        return GirlUI()
    }

    override fun initView() {
        mGirlRv = find<RecyclerView>(ConstantIds.girlRvId)
        mData = ArrayList()

        mGirlRv.layoutManager = GridLayoutManager(activity,2)
        mGirlRv.adapter = GirlAdapter(activity,mData)
    }

    override fun initData() {
        presenter.getGirlData("Android",10,1)
    }

    companion object {
        fun newInstance(): GirlFragment {
            val girlFragment = GirlFragment()
            return girlFragment
        }
    }

    override fun getGirlDataSuccess(mData: MutableList<JsonResult>) {
        if (!mData.isEmpty()){
            this.mData.addAll(mData)
            mGirlRv.adapter.notifyDataSetChanged()
        }
    }

    override fun getGirlDataFailed(message: String) {
        toast(getString(R.string.app_name))
    }

}