package com.example.jetictors.welfare.view.views.home.index

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.TabH5UI
import com.example.jetictors.welfare.view.UI.TabIosUI

/**
 * 描述    : 前端页fragment
 * author  : Jetictors
 * time    :  2017/10/31 14:55
 * version : v1.0.1
 */
class TabH5Fragment @SuppressLint("ValidFragment")
private constructor(): BaseFragment<TabH5UI, TabH5Fragment>(){

    override fun getAnkoUI(): TabH5UI {
        return TabH5UI()
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): TabH5Fragment {
            val tabH5Fragment = TabH5Fragment()
            return tabH5Fragment
        }
    }

}