package com.example.jetictors.welfare.view.UI

import android.content.res.ColorStateList
import android.support.v4.content.ContextCompat
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.constant.ConstantIds
import org.jetbrains.anko.*
import org.jetbrains.anko.design.bottomNavigationView

/**
 * 描述    : 首页布局
 * author  : Jetictors
 * time    :  2017/10/30 16:30
 * version : v1.0.1
 */
class MainUI : AnkoComponent<BaseActivity<MainUI>> {

    override fun createView(ui: AnkoContext<BaseActivity<MainUI>>) = with(ui) {
        relativeLayout{

            // 装载fragment
            frameLayout{
                id = ConstantIds.mainContentId
            }.lparams(matchParent, matchParent){
                above(ConstantIds.mainBottomViewId)
            }

            // 底部栏
            bottomNavigationView{
                id = ConstantIds.mainBottomViewId
                setBackgroundColor(ContextCompat.getColor(ctx,R.color.colorPrimary))

                itemTextColor = ColorStateList.valueOf(ContextCompat.getColor(ctx,R.color.common_clr_white))
                itemIconTintList = ColorStateList.valueOf(ContextCompat.getColor(ctx,android.R.color.transparent))
            }.lparams(matchParent, dip(56)){
                alignParentBottom()
             }
        }
    }
}