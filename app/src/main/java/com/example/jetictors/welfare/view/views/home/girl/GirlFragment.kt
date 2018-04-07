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
import org.jetbrains.anko.support.v4.ctx
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

    private lateinit var mGirlRv : RecyclerView
    private lateinit var mData : MutableList<JsonResult>
    private val mPresenter : GirlPresenter by lazy { GirlPresenter() }

    init {
        mPresenter.attachView(this)
    }

    override fun getAnkoUI(): GirlUI {
        return GirlUI()
    }

    override fun initView() {
        mGirlRv = find(ConstantIds.girlRvId)
        mData = ArrayList()

        mGirlRv.layoutManager = GridLayoutManager(activity,2)
        mGirlRv.adapter = GirlAdapter(ctx,mData)
    }

    override fun initData() {
        mPresenter.getGirlData("Android",10,1)
    }

    companion object {
        fun newInstance() = GirlFragment()
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

    override fun showLoading() {
    }

    override fun dissmissLoading() {
    }

}