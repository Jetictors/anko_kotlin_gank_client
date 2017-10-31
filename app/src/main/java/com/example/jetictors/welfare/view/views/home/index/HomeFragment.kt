package com.example.jetictors.welfare.view.views.home.index

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.HomeUI

/**
 * 描述    : 首页fragment
 * author  : Jetictors
 * time    :  2017/10/30 14:37
 * version : v1.0.1
 */
class HomeFragment @SuppressLint("ValidFragment")
private constructor() : BaseFragment<HomeUI,HomeFragment>(){

    override fun getAnkoUI(): HomeUI {
        return HomeUI()
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): HomeFragment {
            val homeFragment = HomeFragment()
            return homeFragment
        }
    }

}