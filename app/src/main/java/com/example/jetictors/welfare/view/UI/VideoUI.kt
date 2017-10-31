package com.example.jetictors.welfare.view.UI

import android.support.v4.content.ContextCompat
import android.view.Gravity
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.views.home.video.VideoFragment
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
            horizontalGravity = Gravity.CENTER
            verticalGravity = Gravity.CENTER

            textView(R.string.bottom_tab_video){
                textSize = 25f
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            )
        }

    }

}