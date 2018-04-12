package com.example.jetictors.welfare.view.views.home

import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.MimeUI
import com.example.jetictors.welfare.view.widgets.GlideCircleTransform
import org.jetbrains.anko.support.v4.act
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.find

/**
 * 描述    : 个人中心
 * author  : Jetictors
 * time    :  2017/10/30 16:29
 * version : v1.0.1
 */
class MimeFragment : BaseFragment<MimeUI,MimeFragment>(){

    private lateinit var mIvUserHeader : ImageView

    override fun getAnkoUI(): MimeUI {
        return MimeUI()
    }

    override fun initView() {

        mIvUserHeader = find(R.id.iv_user_head)

        Glide.with(ctx)
                .load("https://user-gold-cdn.xitu.io/2018/3/25/1625d7c5414004e0?imageView2/1/w/90/h/90/q/85/format/webp/interlace/1")
                .centerCrop()
                .placeholder(R.color.clr_eeeeee)
                .error(R.color.clr_eeeeee)
                .transform(GlideCircleTransform(ctx))
                .into(mIvUserHeader)

        initListener()
    }

    override fun initData() {
    }

    private fun initListener() {

        // github
        find<TextView>(R.id.tx_user_github).setOnClickListener {
            act.startActivity(
                    Intent().apply { putExtra("WebUrl","https://github.com/Jetictors") }
                            .apply { putExtra("Title",(it as TextView).text) }
                            .apply { setClass(act,WebActivity::class.java) }
            )
        }

        // blog
        find<TextView>(R.id.tx_user_blog).setOnClickListener {
            act.startActivity(
                    Intent().apply { putExtra("WebUrl", "https://www.cnblogs.com/Jetictors/") }
                            .apply { putExtra("Title",(it as TextView).text) }
                            .apply { setClass(act,WebActivity::class.java) }
            )
        }

        // juejin
        find<TextView>(R.id.tx_user_juejin).setOnClickListener {
            act.startActivity(
                    Intent().apply { putExtra("WebUrl","https://juejin.im/user/5709f5798ac247004c295d95") }
                            .apply { putExtra("Title",(it as TextView).text) }
                            .apply { setClass(act,WebActivity::class.java) }
            )
        }
    }

    companion object {
        fun newInstance() = MimeFragment()
    }
}