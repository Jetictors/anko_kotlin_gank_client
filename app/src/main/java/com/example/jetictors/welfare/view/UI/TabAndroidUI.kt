package com.example.jetictors.welfare.view.UI

import android.widget.LinearLayout
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.index.TabAndroidFragment
import org.jetbrains.anko.*

/**
 * 描述    : android页布局
 * author  : Jetictors
 * time    :  2017/10/31 14:49
 * version : v1.0.1
 */
class TabAndroidUI : AnkoComponent<BaseFragment<TabAndroidUI,TabAndroidFragment>>{

    override fun createView(ui: AnkoContext<BaseFragment<TabAndroidUI, TabAndroidFragment>>) = with(ui) {
        verticalLayout{
            include<LinearLayout>(R.layout.layout_common_rv)
        }
    }

}