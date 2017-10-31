package com.example.jetictors.welfare.view.UI

import android.support.v4.content.ContextCompat
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.index.HomeFragment
import org.jetbrains.anko.*
import org.jetbrains.anko.design.tabLayout
import org.jetbrains.anko.support.v4.viewPager

/**
 * 描述    : 首页fragment布局
 * author  : Jetictors
 * time    :  2017/10/31 14:40
 * version : v1.0.1
 */
class HomeUI : AnkoComponent<BaseFragment<HomeUI,HomeFragment>>{

    override fun createView(ui: AnkoContext<BaseFragment<HomeUI, HomeFragment>>) = with(ui) {

        verticalLayout(){

            tabLayout(){
            }.lparams(matchParent, wrapContent)

            viewPager(){

            }.lparams(matchParent, matchParent)

        }

    }

}