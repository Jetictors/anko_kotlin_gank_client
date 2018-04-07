package com.example.jetictors.welfare.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx

/**
 * 描述    : fragment基类
 * author  : Jetictors
 * time    :  2017/10/30 14:33
 * version : v1.0.1
 */
abstract class BaseFragment<out T : AnkoComponent<F>,F> : Fragment() {

    val mFragment : F? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (getAnkoUI() == null){
            throw RuntimeException("initLayout() is null !")
        }

        return getAnkoUI()?.createView(AnkoContext.create(ctx,mFragment) as AnkoContext<F>)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()

        initData()
    }

    abstract fun getAnkoUI() : T?

    abstract fun initView()

    abstract fun initData()
}
