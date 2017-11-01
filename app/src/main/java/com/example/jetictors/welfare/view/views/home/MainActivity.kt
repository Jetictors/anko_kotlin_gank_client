package com.example.jetictors.welfare.view.views.home

import android.support.design.widget.BottomNavigationView
import android.util.Log
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

    private val TAG : String = javaClass.name
    lateinit var mBottomView : BottomNavigationView

    override fun getAnkoUI(): MainUI {
        return MainUI()
    }

    override fun initView() {
        mBottomView = find<BottomNavigationView>(ConstantIds.mainBottomViewId)
        supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,HomeFragment.newInstance()).commit()

        mBottomView.setOnNavigationItemSelectedListener { item ->

            when(item.itemId){
                R.id.btn_item_home -> {
                    supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,HomeFragment.newInstance()).commit()
                    false
                }
                R.id.btn_item_girl -> {
                    supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,GirlFragment.newInstance()).commit()
                    false
                }
                R.id.btn_item_video -> {
                    supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,VideoFragment.newInstance()).commit()
                    false
                }
                R.id.btn_item_mime -> {
                    supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,MimeFragment.newInstance()).commit()
                    false
                }
                else -> Log.e(TAG,"不存在的id")
            }
            true
        }
    }

    override fun initData() {

    }

}