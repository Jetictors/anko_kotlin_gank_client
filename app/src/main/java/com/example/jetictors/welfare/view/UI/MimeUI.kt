package com.example.jetictors.welfare.view.UI

import android.support.v4.content.ContextCompat
import android.view.Gravity
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.MimeFragment
import org.jetbrains.anko.*

/**
 * 描述    : 个人中心布局
 * author  : Jetictors
 * time    :  2017/10/31 14:45
 * version : v1.0.1
 */
class MimeUI : AnkoComponent<BaseFragment<MimeUI, MimeFragment>> {

    override fun createView(ui: AnkoContext<BaseFragment<MimeUI, MimeFragment>>) = with(ui) {
        verticalLayout() {
            horizontalGravity = Gravity.CENTER
            verticalGravity = Gravity.CENTER

            textView(R.string.bottom_tab_mime){
                textSize = 25f
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            )
        }
    }

}