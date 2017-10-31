package com.example.jetictors.welfare.view.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * 描述    : framgnet的适配器
 * author  : Jetictors
 * time    :  2017/10/31 15:34
 * version : v1.0.1
 */
class CommonViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    var mFragmentList : MutableList<Fragment>
    var mTitles : MutableList<String>

    init {
        mFragmentList = ArrayList<Fragment>()
        mTitles = ArrayList<String>()
    }

    constructor(fm: FragmentManager?, mFragmentList: MutableList<Fragment>, mTitles : MutableList<String>) : this(fm) {
        this.mTitles = mTitles
        this.mFragmentList = mFragmentList
    }

    constructor(fm: FragmentManager?, mFragmentList: MutableList<Fragment>) : this(fm) {
        this.mFragmentList = mFragmentList
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList.get(position)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mTitles.get(position)
    }
}