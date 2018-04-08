package com.example.jetictors.welfare.view.views.home.index

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.modle.bean.JsonResult
import com.example.jetictors.welfare.presenter.BasePresenter
import com.example.jetictors.welfare.presenter.contract.IContract
import com.example.jetictors.welfare.view.UI.CommonTabUI
import com.example.jetictors.welfare.view.adapter.CommonTabAdapter
import com.example.jetictors.welfare.view.widgets.CommonItemDecoration
import kotlinx.android.synthetic.main.layout_common_rv.*
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.dip

/**
 * 描述    : android页fragment
 * author  : Jetictors
 * time    :  2017/10/31 14:48
 * version : v1.0.1
 */
class CommonTabFragment : BaseFragment<CommonTabUI, CommonTabFragment>(), IContract.IView{

    private lateinit var mData : MutableList<JsonResult>
    private lateinit var mAdapter : CommonTabAdapter
    private val mPresenter : BasePresenter by lazy { BasePresenter() }
    private var page : Int = 1
    private var tabType : String = ""

    init {
        mPresenter.attachView(this)
    }

    override fun getAnkoUI(): CommonTabUI {
        return CommonTabUI()
    }

    override fun initView() {

        mData = mutableListOf()

        this.common_rv.layoutManager = LinearLayoutManager(ctx)
        mAdapter = CommonTabAdapter(ctx,mData)
        this.common_rv.adapter = mAdapter
        this.common_rv.addItemDecoration(CommonItemDecoration(ctx,dip(8),
                R.color.common_clr_transparent,false,CommonItemDecoration.VERTICAL))

        initListener()
    }

    override fun initData() {

        with(arguments){
            this?.getString(CommonTabFragment.TAB_TYPE_KEY).let {
                tabType = when(it){
                    TAB_TYPE_VALUE_ANDROID -> "Android"
                    TAB_TYPE_VALUE_IOS -> "iOS"
                    TAB_TYPE_VALUE_WEB -> "前端"
                    else -> "Android"
                }
            }

        }
        mPresenter.getData(tabType,20,page)
        this.common_swipe_rfl.isRefreshing = true
    }

    private fun initListener() {
        mAdapter.setOnItemClickListener { adapter, view, position ->

        }

        this.common_swipe_rfl.setOnRefreshListener {
            mPresenter.getData("Android",20,page)
        }
    }

    override fun getDataSuccess(mData: MutableList<JsonResult>) {
        this.common_swipe_rfl.isRefreshing = false
        if (!mData.isEmpty()){
            mAdapter.setNewData(mData)
        }
    }

    override fun getDataFailed(message: String) {
        this.common_swipe_rfl.isRefreshing = false
    }

    override fun showLoading() {
    }

    override fun dismissLoading() {
    }

    companion object {

        const val TAB_TYPE_KEY = "tab_type"
        const val TAB_TYPE_VALUE_ANDROID = "android"
        const val TAB_TYPE_VALUE_IOS = "ios"
        const val TAB_TYPE_VALUE_WEB = "web"


        fun newInstance(type : String) = CommonTabFragment().apply {
            val bundle = Bundle()
            bundle.putString(TAB_TYPE_KEY,type)
            this.arguments = bundle
        }
    }

}