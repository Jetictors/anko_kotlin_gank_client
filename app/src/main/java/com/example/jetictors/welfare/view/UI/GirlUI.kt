package com.example.jetictors.welfare.view.UI

import android.support.v7.widget.Toolbar
import android.view.View
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.girl.GirlFragment
import kotlinx.android.synthetic.main.layout_toolbar.view.*
import org.jetbrains.anko.*

/**
 * 描述    : 妹子布局
 * author  : Jetictors
 * time    :  2017/10/30 17:56
 * version : v1.0.1
 */
class GirlUI : AnkoComponent<BaseFragment<GirlUI,GirlFragment>>{

    override fun createView(ui: AnkoContext<BaseFragment<GirlUI, GirlFragment>>) = with(ui) {
        verticalLayout() {

            include<Toolbar>(R.layout.layout_toolbar){
                toolbar_tv_back.visibility = View.GONE
                toolbar_tv_title.text = resources.getString(R.string.bottom_tab_girl)
            }

        }
    }

}