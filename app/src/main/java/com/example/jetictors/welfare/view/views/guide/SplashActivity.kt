package com.example.jetictors.welfare.view.views.guide

import android.content.Intent
import android.util.Log
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.view.UI.SplashUI
import com.example.jetictors.welfare.view.views.home.MainActivity

/**
 * 描述    : 启动页
 * author  : Jetictors
 * time    :  2017/10/30 14:33
 * version : v1.0.1
 */
class SplashActivity : BaseActivity<SplashUI>(){

    override fun getAnkoUI(): SplashUI {
        return SplashUI()
    }

    override fun initView() {
        Log.e("SplashActivity","initView()")

        startActivity(Intent(this,MainActivity::class.java))
    }

    override fun initData() {
        Log.e("SplashActivity","initData()")
    }


}