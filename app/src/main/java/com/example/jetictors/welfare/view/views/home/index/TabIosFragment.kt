package com.example.jetictors.welfare.view.views.home.index

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.TabIosUI

/**
 * 描述    : android页fragment
 * author  : Jetictors
 * time    :  2017/10/31 14:52
 * version : v1.0.1
 */
class TabIosFragment @SuppressLint("ValidFragment")
private constructor(): BaseFragment<TabIosUI, TabIosFragment>(){

    override fun getAnkoUI(): TabIosUI {
        return TabIosUI()
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): TabIosFragment {
            val tabIosFragment = TabIosFragment()
            return tabIosFragment
        }
    }
}