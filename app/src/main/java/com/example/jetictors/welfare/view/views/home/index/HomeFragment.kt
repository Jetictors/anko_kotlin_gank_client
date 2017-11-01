package com.example.jetictors.welfare.view.views.home.index

import android.annotation.SuppressLint
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.constant.ConstantIds
import com.example.jetictors.welfare.view.UI.HomeUI
import kotlinx.android.synthetic.main.layout_toolbar.*
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.dip
import org.jetbrains.anko.support.v4.find

/**
 * 描述    : 首页fragment
 * author  : Jetictors
 * time    :  2017/10/30 14:37
 * version : v1.0.1
 */
class HomeFragment @SuppressLint("ValidFragment")
private constructor() : BaseFragment<HomeUI,HomeFragment>(){

    lateinit var mTabLayout : TabLayout
    lateinit var mViewPager : ViewPager
    lateinit var mFragmentList : MutableList<Fragment>
    lateinit var mTitles : MutableList<String>

    override fun getAnkoUI(): HomeUI {
        return HomeUI()
    }

    override fun initView() {

        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        mFragmentList = ArrayList()
        mTitles = ArrayList()

        mTabLayout = find<TabLayout>(ConstantIds.homeTabLayoutId)
        mViewPager = find<ViewPager>(ConstantIds.homeViewPagerId)

        initTabLayout()
        initViewPager()
        initListener()

        mTabLayout.setupWithViewPager(mViewPager)
    }

    private fun initViewPager() {
        mViewPager.adapter = object : FragmentPagerAdapter(childFragmentManager){
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
    }

    private fun initTabLayout(){
        mTabLayout.setTabTextColors(ContextCompat.getColor(ctx,R.color.common_clr_black)
                ,ContextCompat.getColor(ctx,R.color.common_clr_white))

        mTabLayout.setSelectedTabIndicatorHeight(dip(3))
        mTabLayout.setBackgroundColor(ContextCompat.getColor(ctx,R.color.colorPrimary))
        mTabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(ctx,R.color.common_clr_white))
    }

    private fun initListener(){

    }

    override fun initData() {

        mTitles.add(0,getString(R.string.tab_title_android))
        mTitles.add(1,getString(R.string.tab_title_ios))
        mTitles.add(2,getString(R.string.tab_title_h5))

        mFragmentList.add(0,TabAndroidFragment.newInstance())
        mFragmentList.add(1,TabIosFragment.newInstance())
        mFragmentList.add(2,TabH5Fragment.newInstance())

        mViewPager.adapter.notifyDataSetChanged()
    }

    companion object {
        fun newInstance(): HomeFragment {
            val homeFragment = HomeFragment()
            return homeFragment
        }
    }

}