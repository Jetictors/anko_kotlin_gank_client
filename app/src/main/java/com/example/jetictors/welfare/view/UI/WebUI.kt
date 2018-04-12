package com.example.jetictors.welfare.view.UI

import android.support.v7.widget.Toolbar
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import org.jetbrains.anko.*

/**
 * @描述    :    网页activity的布局
 * @author  :   Jetictors
 * @time    :   2018/4/12 10:51
 * @version :   v1.0.1
 */
class WebUI : AnkoComponent<BaseActivity<WebUI>> {

    override fun createView(ui: AnkoContext<BaseActivity<WebUI>>) = with(ui){

        verticalLayout{
            lparams(matchParent, matchParent)
            backgroundColorResource = R.color.common_clr_transparent

            include<Toolbar>(R.layout.layout_toolbar)

            webView {
                id = R.id.web_view
            }.lparams(matchParent, matchParent)

        }

    }
}