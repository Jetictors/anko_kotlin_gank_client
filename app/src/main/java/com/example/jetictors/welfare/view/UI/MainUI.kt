package com.example.jetictors.welfare.view.UI

import android.view.View
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import org.jetbrains.anko.*

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
                id = R.id.main_content
            }.lparams(matchParent, matchParent){
                weight = 1f
            }

            // 底部栏
            include<View>(R.layout.layout_main_bottom_view)
        }
    }

}