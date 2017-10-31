package com.example.jetictors.welfare.view.views.home

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.MimeUI

/**
 * 描述    : 个人中心
 * author  : Jetictors
 * time    :  2017/10/30 16:29
 * version : v1.0.1
 */
class MimeFragment @SuppressLint("ValidFragment")
private constructor(): BaseFragment<MimeUI,MimeFragment>(){

    override fun getAnkoUI(): MimeUI {
        return MimeUI()
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): MimeFragment {
            val mimeFragment = MimeFragment()
            return mimeFragment
        }
    }

}