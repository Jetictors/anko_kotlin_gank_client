package com.example.jetictors.welfare.view.UI

import android.view.Gravity
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.index.TabH5Fragment
import org.jetbrains.anko.*

/**
 * 描述    : 前端页布局
 * author  : Jetictors
 * time    :  2017/10/31 14:56
 * version : v1.0.1
 */
class TabH5UI : AnkoComponent<BaseFragment<TabH5UI, TabH5Fragment>> {

    override fun createView(ui: AnkoContext<BaseFragment<TabH5UI, TabH5Fragment>>) = with(ui) {

        verticalLayout() {
            horizontalGravity = Gravity.CENTER
            verticalGravity = Gravity.CENTER

            textView(R.string.tab_title_h5){
                textSize = 25f
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            )
        }

    }

}