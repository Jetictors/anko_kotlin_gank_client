package com.example.jetictors.welfare.view.views.home.video

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.VideoUI

/**
 * 描述    : 休息视频fragment
 * author  : Jetictors
 * time    :  2017/10/30 14:39
 * version : v1.0.1
 */
class VideoFragment @SuppressLint("ValidFragment")
private constructor(): BaseFragment<VideoUI,VideoFragment>(){

    override fun getAnkoUI(): VideoUI {
        return VideoUI()
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): VideoFragment {
            val videoFragment = VideoFragment()
            return videoFragment
        }
    }

}