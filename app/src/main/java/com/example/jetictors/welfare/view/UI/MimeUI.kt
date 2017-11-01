package com.example.jetictors.welfare.view.UI

import android.support.v7.widget.Toolbar
import android.view.View
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.MimeFragment
import kotlinx.android.synthetic.main.layout_toolbar.view.*
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

            include<Toolbar>(R.layout.layout_toolbar){
                toolbar_tv_back.visibility = View.GONE
                toolbar_tv_title.text = resources.getString(R.string.bottom_tab_mime)
            }

        }
    }

}