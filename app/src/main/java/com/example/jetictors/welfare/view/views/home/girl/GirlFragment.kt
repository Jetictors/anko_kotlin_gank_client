package com.example.jetictors.welfare.view.views.home.girl

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.GirlUI

/**
 * 描述    : 妹子fragment
 * author  : Jetictors
 * time    :  2017/10/30 14:38
 * version : v1.0.1
 */
class GirlFragment @SuppressLint("ValidFragment")
private constructor(): BaseFragment<GirlUI,GirlFragment>(){


    override fun getAnkoUI(): GirlUI {
        return GirlUI()
    }

    override fun initView() {


    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): GirlFragment {
            val girlFragment = GirlFragment()
            return girlFragment
        }
    }

}