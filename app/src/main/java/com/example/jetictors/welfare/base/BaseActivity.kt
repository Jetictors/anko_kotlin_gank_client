package com.example.jetictors.welfare.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.jetictors.welfare.view.UI.SplashUI
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.setContentView
import java.lang.RuntimeException

/**
 * 描述    : activity基类
 * author  : Jetictors
 * time    :  2017/10/30 14:33
 * version : v1.0.1
 */
abstract class BaseActivity<T : AnkoComponent<BaseActivity<T>>> : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (null == getAnkoUI()){
            throw RuntimeException("initLayout() is a null !")
        }

        getAnkoUI().setContentView(this)
        initView()
        initData()
    }

    abstract fun getAnkoUI() : T

    abstract fun initView()

    abstract fun initData()
}