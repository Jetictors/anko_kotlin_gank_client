package com.example.jetictors.welfare.view.UI

import android.support.v4.content.ContextCompat
import android.support.v7.widget.Toolbar
import android.view.Gravity
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
        verticalLayout{

            include<Toolbar>(R.layout.layout_toolbar){
                toolbar_tv_back.visibility = View.GONE
                toolbar_tv_title.text = resources.getString(R.string.bottom_tab_mime)
            }

            verticalLayout{
                lparams(matchParent, wrapContent)
                backgroundColorResource = R.color.colorPrimary
                bottomPadding = dip(36)
                gravity = Gravity.CENTER_HORIZONTAL

                imageView{
                    id = R.id.iv_user_head
                    imageResource = R.mipmap.ic_launcher_round
                }.lparams(dip(72),dip(72))

                textView(ctx.getString(R.string.tx_user_name)){
                    id = R.id.tx_user_name
                    textSize = 20f
                    textColorResource = R.color.common_clr_white
                }.lparams(wrapContent, wrapContent){
                    topMargin = dip(8)
                    bottomMargin = dip(8)
                }

                textView(ctx.getString(R.string.tx_user_info)){
                    id = R.id.tx_user_info
                    textSize = 14f
                    textColorResource = R.color.common_clr_white
                    gravity = Gravity.CENTER
                }.lparams(matchParent, wrapContent) {
                    leftPadding = dip(12)
                    rightPadding = dip(12)
                }
            }

            verticalLayout {
                backgroundColorResource = R.color.clr_eeeeee
                lparams(matchParent, matchParent)

                textView(ctx.getString(R.string.tx_juejin)){
                    id = R.id.tx_user_juejin
                    backgroundColorResource = R.color.common_clr_white
                    val leftDrawable = ContextCompat.getDrawable(ctx,R.mipmap.ic_address)
                    val rightDrawable = ContextCompat.getDrawable(ctx,R.mipmap.ic_more)
                    leftDrawable?.setBounds(0,0, dip(24), dip(24))
                    rightDrawable?.setBounds(0,0, dip(24), dip(24))
                    setCompoundDrawables(leftDrawable,null,rightDrawable,null)
                    this.compoundDrawablePadding = dip(8)
                    gravity = Gravity.CENTER_VERTICAL

                    textSize = 15f
                    horizontalPadding = dip(12)
                    verticalPadding = dip(6)
                }.lparams(matchParent, wrapContent){
                    topMargin = dip(12)
                }

                textView(ctx.getString(R.string.tx_blog)){
                    id = R.id.tx_user_blog

                    backgroundColorResource = R.color.common_clr_white
                    val leftDrawable = ContextCompat.getDrawable(ctx,R.mipmap.ic_address)
                    val rightDrawable = ContextCompat.getDrawable(ctx,R.mipmap.ic_more)
                    leftDrawable?.setBounds(0,0, dip(24), dip(24))
                    rightDrawable?.setBounds(0,0, dip(24), dip(24))
                    setCompoundDrawables(leftDrawable,null,rightDrawable,null)
                    this.compoundDrawablePadding = dip(8)
                    gravity = Gravity.CENTER_VERTICAL

                    textSize = 15f
                    horizontalPadding = dip(12)
                    verticalPadding = dip(6)
                }.lparams(matchParent, wrapContent){
                    topMargin = dip(1)
                }

                textView(ctx.getString(R.string.tx_github)){
                    id = R.id.tx_user_github

                    backgroundColorResource = R.color.common_clr_white
                    val leftDrawable = ContextCompat.getDrawable(ctx,R.mipmap.ic_github)
                    val rightDrawable = ContextCompat.getDrawable(ctx,R.mipmap.ic_more)
                    leftDrawable?.setBounds(0,0, dip(24), dip(24))
                    rightDrawable?.setBounds(0,0, dip(24), dip(24))
                    setCompoundDrawables(leftDrawable,null,rightDrawable,null)
                    this.compoundDrawablePadding = dip(8)
                    gravity = Gravity.CENTER_VERTICAL

                    textSize = 15f
                    horizontalPadding = dip(12)
                    verticalPadding = dip(6)
                }.lparams(matchParent, wrapContent){
                    topMargin = dip(12)
                }
            }

        }
    }

}