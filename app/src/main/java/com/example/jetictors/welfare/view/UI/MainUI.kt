package com.example.jetictors.welfare.view.UI

import android.support.v4.content.ContextCompat
import android.view.View
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.constant.ConstantIds
import org.jetbrains.anko.*

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

            textView{
                backgroundColor = ContextCompat.getColor(ctx,R.color.colorPrimary)
            }.lparams(matchParent,dip(1)){
                above(ConstantIds.mainBottomViewId)
            }

            // 底部栏
            include<View>(R.layout.layout_main_bottom_view){
                id = ConstantIds.mainBottomViewId
            }.lparams(matchParent, wrapContent){
                alignParentBottom()
            }
        }
    }

}