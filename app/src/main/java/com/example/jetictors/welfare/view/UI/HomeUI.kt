package com.example.jetictors.welfare.view.UI

import android.support.v7.widget.Toolbar
import android.view.View
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.constant.ConstantIds
import com.example.jetictors.welfare.view.views.home.index.HomeFragment
import kotlinx.android.synthetic.main.layout_toolbar.view.*
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

    override fun createView(ui: AnkoContext<BaseFragment<HomeUI,HomeFragment>>) = with(ui) {

        verticalLayout{

            include<Toolbar>(R.layout.layout_toolbar){
                toolbar_tv_back.visibility = View.GONE
                toolbar_tv_title.text = resources.getString(R.string.bottom_tab_home)
            }

            tabLayout{
                id = ConstantIds.homeTabLayoutId
            }.lparams(matchParent, wrapContent)

            viewPager(){
                id = ConstantIds.homeViewPagerId
            }.lparams(matchParent, matchParent)

        }

    }

}