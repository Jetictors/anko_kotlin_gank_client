package com.example.jetictors.welfare.view.UI

import com.example.jetictors.welfare.base.BaseActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.viewPager

/**
 * 描述    : 导航页布局
 * author  : Jetictors
 * time    :  2017/10/30 17:04
 * version : v1.0.1
 */
class GuideUI : AnkoComponent<BaseActivity<GuideUI>>{

    override fun createView(ui: AnkoContext<BaseActivity<GuideUI>>) = with(ui){

        frameLayout{
            viewPager{}.lparams(matchParent, matchParent)

            linearLayout{

            }.lparams(matchParent , wrapContent)

            textView("立即体验"){

            }.lparams(wrapContent, wrapContent){
                paddingHorizontal = dip(24)
                paddingVertical = dip(12)
            }
        }
    }

}