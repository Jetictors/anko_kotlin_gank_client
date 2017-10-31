package com.example.jetictors.welfare.view.views.home

import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.view.MenuItem
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.constant.ConstantIds
import com.example.jetictors.welfare.view.UI.MainUI
import com.example.jetictors.welfare.view.views.home.girl.GirlFragment
import com.example.jetictors.welfare.view.views.home.index.HomeFragment
import com.example.jetictors.welfare.view.views.home.video.VideoFragment
import org.jetbrains.anko.find

/**
 * 描述    : 主页activity
 * author  : Jetictors
 * time    :  2017/10/30 14:32
 * version : v1.0.1
 */
class MainActivity : BaseActivity<MainUI>(){

    lateinit var mBottomView : BottomNavigationView
    lateinit var mainUI : MainUI

    override fun getAnkoUI(): MainUI {
        mainUI = MainUI()
        return mainUI
    }

    override fun initView() {
        mBottomView = find<BottomNavigationView>(ConstantIds.mainBottomViewId)
        mBottomView.inflateMenu(R.menu.main_bottom_view)
        supportFragmentManager.beginTransaction().add(ConstantIds.mainContentId,GirlFragment.newInstance()).commit()

    }

    override fun initData() {

//        mFragmentList.add(0,HomeFragment.newInstance())
//        mFragmentList.add(1,GirlFragment.newInstance())
//        mFragmentList.add(2,VideoFragment.newInstance())
//        mFragmentList.add(3,MimeFragment.newInstance())
//
//        mainUI.mViewPager.adapter.notifyDataSetChanged()
    }

}