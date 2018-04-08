package com.example.jetictors.welfare.view.views.home.index

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
class HomeFragment : BaseFragment<HomeUI,HomeFragment>(){

    private lateinit var mTabLayout : TabLayout
    private lateinit var mViewPager : ViewPager
    private var mFragmentList : MutableList<Fragment> = mutableListOf()
    private val mTitles : Array<String> by lazy {
        arrayOf(
                ctx.getString(R.string.tab_title_android),
                ctx.getString(R.string.tab_title_ios),
                ctx.getString(R.string.tab_title_h5)
        )
    }

    override fun getAnkoUI(): HomeUI {
        return HomeUI()
    }

    override fun initView() {

        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        mTabLayout = find(ConstantIds.homeTabLayoutId)
        mViewPager = find(ConstantIds.homeViewPagerId)

        initTabLayout()
        initViewPager()

        mTabLayout.setupWithViewPager(mViewPager)
    }

    private fun initViewPager() {
        mViewPager.adapter = object : FragmentPagerAdapter(childFragmentManager){
            override fun getItem(position: Int): Fragment {
                return mFragmentList[position]
            }

            override fun getCount(): Int {
                return mFragmentList.size
            }

            override fun getPageTitle(position: Int): CharSequence {
                return mTitles[position]
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

    override fun initData() {
        mFragmentList.add(CommonTabFragment.newInstance(CommonTabFragment.TAB_TYPE_VALUE_ANDROID))
        mFragmentList.add(CommonTabFragment.newInstance(CommonTabFragment.TAB_TYPE_VALUE_IOS))
        mFragmentList.add(CommonTabFragment.newInstance(CommonTabFragment.TAB_TYPE_VALUE_WEB))

        mViewPager.adapter?.notifyDataSetChanged()
    }

    companion object {
        fun newInstance() = HomeFragment()
    }

}