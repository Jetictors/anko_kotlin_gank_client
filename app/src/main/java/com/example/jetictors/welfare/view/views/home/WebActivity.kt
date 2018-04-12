package com.example.jetictors.welfare.view.views.home

import android.annotation.SuppressLint
import android.webkit.WebView
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseActivity
import com.example.jetictors.welfare.view.UI.WebUI
import kotlinx.android.synthetic.main.layout_toolbar.*
import org.jetbrains.anko.find

/**
 * @描述    :    加载网页
 * @author  :   Jetictors
 * @time    :   2018/4/12 10:50
 * @version :   v1.0.1
 */
class WebActivity : BaseActivity<WebUI>() {

    private lateinit var mWebView : WebView

    override fun getAnkoUI(): WebUI {
        return WebUI()
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun initView() {
        mWebView = find(R.id.web_view)

        this.toolbar_tv_back.setOnClickListener { this.finish() }

        // 设置setting
        with(mWebView.settings){
            this.javaScriptEnabled = true        // 支持javaScript
            this.loadsImagesAutomatically = true // 自动加载图片

            this.useWideViewPort = true          // 将图片调整到适合webView的大小
            this.loadWithOverviewMode = true     // 缩放至屏幕的大小
        }
    }

    override fun initData() {
        val loadUrl = intent.extras.get("WebUrl").toString()
        val mTitle = intent.extras.get("Title").toString()

        this.toolbar_tv_title.text = mTitle

        mWebView.loadUrl(loadUrl)
    }
}