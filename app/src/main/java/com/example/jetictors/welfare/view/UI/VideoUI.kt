package com.example.jetictors.welfare.view.UI

import android.support.v7.widget.Toolbar
import android.view.View
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.video.VideoFragment
import kotlinx.android.synthetic.main.layout_toolbar.view.*
import org.jetbrains.anko.*

/**
 * 描述    : 视频布局
 * author  : Jetictors
 * time    :  2017/10/31 14:40
 * version : v1.0.1
 */
class VideoUI : AnkoComponent<BaseFragment<VideoUI, VideoFragment>> {

    override fun createView(ui: AnkoContext<BaseFragment<VideoUI, VideoFragment>>) = with(ui) {

        verticalLayout() {
            include<Toolbar>(R.layout.layout_toolbar){
                toolbar_tv_back.visibility = View.GONE
                toolbar_tv_title.text = resources.getString(R.string.bottom_tab_video)
            }
        }

    }

}