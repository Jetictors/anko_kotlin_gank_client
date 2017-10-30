package com.example.jetictors.welfare.view.UI

import android.graphics.Color
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
        verticalLayout() {
            backgroundColor = Color.parseColor("#000000")


            textView("Gank"){
                textSize = 25f
                textColor = Color.RED
            }.lparams(
                    width = matchParent,
                    height = wrapContent
            )
        }
    }
}

