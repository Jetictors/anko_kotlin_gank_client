package com.example.jetictors.welfare.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * 描述    : fragment基类
 * author  : Jetictors
 * time    :  2017/10/30 14:33
 * version : v1.0.1
 */
abstract class BaseFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (initLayout() == null){
            throw RuntimeException("initLayout() is null !")
        }

        return initLayout()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        initView()

        initData()
    }

    abstract fun initLayout() : View

    abstract fun initView()

    abstract fun initData()

}