package com.example.jetictors.welfare.view.UI

import android.graphics.Color
import android.support.v4.content.ContextCompat
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
            verticalGravity = Gravity.CENTER
            horizontalGravity = Gravity.CENTER
            setBackgroundColor(ContextCompat.getColor(ctx,R.color.colorPrimary))

            imageView(R.mipmap.ic_launcher){

            }.lparams(wrapContent, wrapContent)

            textView(R.string.splash_hint_1){
                textSize = 22f
                textColor = Color.parseColor("#ffffff")
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            ){
                topMargin = dip(12)
            }

            textView(R.string.splash_hint_2){
                textSize = 13f
                textColor = Color.parseColor("#ffffff")
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            ){
                topMargin = dip(8)
            }
        }
    }
}

