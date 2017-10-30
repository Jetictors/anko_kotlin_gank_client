package com.example.jetictors.welfare.view.UI

import android.graphics.Color
import com.example.jetictors.welfare.base.BaseActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.design.bottomNavigationView

/**
 * 描述    : 首页布局
 * author  : Jetictors
 * time    :  2017/10/30 16:30
 * version : v1.0.1
 */
class MainUI : AnkoComponent<BaseActivity<MainUI>> {

    override fun createView(ui: AnkoContext<BaseActivity<MainUI>>) = with(ui) {
        verticalLayout{



            // 装载fragment
            frameLayout{

                textView("MainActivity"){
                    textColor = Color.RED
                    textSize = 15f
                }.lparams(wrapContent, wrapContent)
            }.lparams(matchParent, matchParent)

            // 底部栏
            bottomNavigationView(){
                backgroundColor = Color.parseColor("#ffffff")
            }.lparams(matchParent, wrapContent){
                padding = dip(12)
            }
        }
    }
}