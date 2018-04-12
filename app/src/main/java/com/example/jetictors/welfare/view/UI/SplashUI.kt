package com.example.jetictors.welfare.view.UI

import android.view.Gravity
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import org.jetbrains.anko.*

/**
 * 描述    : 启动页布局
 * author  : Jetictors
 * time    :  2017/10/30 14:51
 * version : v1.0.1
 */
class SplashUI : AnkoComponent<BaseActivity<SplashUI>>{

    override fun createView(ui: AnkoContext<BaseActivity<SplashUI>>) = with(ui) {
        verticalLayout{
            gravity = Gravity.CENTER
            backgroundColorResource = R.color.colorPrimary

            textView(R.string.splash_hint_1){
                textSize = 22f
                textColorResource = R.color.common_clr_white
            }.lparams(wrapContent, wrapContent){
                topMargin = dip(12)
            }

            textView(R.string.splash_hint_2){
                textSize = 13f
                textColorResource = R.color.common_clr_white
            }.lparams(wrapContent, wrapContent){
                topMargin = dip(8)
            }
        }
    }
}

