package com.example.jetictors.welfare.view.views.guide

import android.os.Handler
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.view.UI.SplashUI
import com.example.jetictors.welfare.view.views.home.MainActivity
import org.jetbrains.anko.startActivity

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
        Handler().postDelayed({
            startActivity<MainActivity>()
            this.finish()
        },1500)
    }

    override fun initData() {
    }
}