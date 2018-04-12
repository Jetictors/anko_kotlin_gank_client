package com.example.jetictors.welfare.view.UI

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.View
import com.example.jetictors.welfare.R
import org.jetbrains.anko.*

/**
 * @描述    :    当无数据时的空页面
 * @author  :   Jetictors
 * @time    :   2018/4/8 17:54
 * @version :   v1.0.1
 */
class EmptyViewUI(val ctx : Context) {

        fun emptyView() : View{
            return with(ctx){
                verticalLayout{
                    lparams(matchParent, matchParent)
                    backgroundResource = R.color.common_clr_transparent
                    gravity = Gravity.CENTER

                    imageView{
                        id = R.id.iv_hint
                        imageResource = R.mipmap.ic_pagenofound
                    }.lparams(wrapContent, wrapContent)

                    textView(ctx.getString(R.string.tx_empty)){
                        id = R.id.btn_empty

                        textSize = 14f
                        textColor = ContextCompat.getColor(ctx,R.color.main_bottom_view_tx_color)
                        background = ContextCompat.getDrawable(ctx,R.drawable.empty_view_btn_text_bg)
                        horizontalPadding = dip(12)
                        verticalPadding = dip(6)
                    }.lparams(wrapContent, wrapContent){
                        topMargin = dip(12)
                    }
                }
            }
        }

}