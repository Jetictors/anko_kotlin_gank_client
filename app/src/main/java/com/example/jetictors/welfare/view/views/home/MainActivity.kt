package com.example.jetictors.welfare.view.views.home

import android.widget.RadioButton
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.constant.ConstantIds
import com.example.jetictors.welfare.view.UI.MainUI
import com.example.jetictors.welfare.view.views.home.girl.GirlFragment
import com.example.jetictors.welfare.view.views.home.index.HomeFragment
import com.example.jetictors.welfare.view.views.home.video.VideoFragment

/**
 * 描述    : 主页activity
 * author  : Jetictors
 * time    :  2017/10/30 14:32
 * version : v1.0.1
 */
class MainActivity : BaseActivity<MainUI>(){

    override fun getAnkoUI(): MainUI {
        return MainUI()
    }

    override fun initView() {

        supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,HomeFragment.newInstance()).commit()

        findViewById<RadioButton>(R.id.btn_tab_home).setOnClickListener{
             supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,HomeFragment.newInstance()).commit()
        }

        findViewById<RadioButton>(R.id.btn_tab_girl).setOnClickListener{
            supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,GirlFragment.newInstance()).commit()
        }

        findViewById<RadioButton>(R.id.btn_tab_video).setOnClickListener{
            supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,VideoFragment.newInstance()).commit()
        }

        findViewById<RadioButton>(R.id.btn_tab_mime).setOnClickListener{
            supportFragmentManager.beginTransaction().replace(ConstantIds.mainContentId,MimeFragment.newInstance()).commit()
        }

    }

    override fun initData() {

    }

}