package com.example.jetictors.welfare.view.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.modle.bean.JsonResult
import org.jetbrains.anko.*

/**
 * @描述    :    Android页面的adapter
 * @author  :   Jetictors
 * @time    :   2018/4/8 15:27
 * @version :   v1.0.1
 */
class CommonTabAdapter(val ctx: Context, mData: MutableList<JsonResult>)
    : BaseQuickAdapter<JsonResult, BaseViewHolder>(mData) {

    override fun onCreateDefViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        return BaseViewHolder(createItemView())
    }

    override fun convert(helper: BaseViewHolder?, item: JsonResult?) {
        helper?.let {
            it.setText(R.id.tx_who, item?.who ?: "")
            it.setText(R.id.tx_type, item?.type ?: "")
            it.setText(R.id.tx_desc, item?.desc ?: "")
            it.setText(R.id.tx_time, item?.getCreateTime() ?: "")
        }
    }

    private fun createItemView(): View {
        return with(ctx) {
            verticalLayout {
                background = ContextCompat.getDrawable(ctx,R.color.clr_eeeeee)
                lparams(matchParent, wrapContent)
                padding = dip(12)

                relativeLayout {

                    imageView{
                        id = R.id.iv_user
                        imageResource = R.mipmap.ic_bottom_mime_false
                    }.lparams(wrapContent, wrapContent){
                        alignParentLeft()
                    }

                    textView(R.string.app_name) {
                        id = R.id.tx_who
                        textSize = 13f
                        gravity = Gravity.CENTER_VERTICAL
                    }.lparams(wrapContent, wrapContent){
                        rightOf(R.id.iv_user)
                        centerVertically()
                        leftMargin = dip(8)
                    }

                    textView(R.string.app_name) {
                        id = R.id.tx_type
                        textSize = 15f
                    }.lparams(wrapContent, wrapContent){
                        alignParentRight()
                    }

                }.lparams(matchParent, wrapContent)

                textView {
                    id = R.id.tx_desc
                    textSize = 15f
                    textColor = R.color.common_clr_black
                }.lparams(matchParent, wrapContent) {
                    topMargin = dip(8)
                    bottomMargin = dip(8)
                }

                textView(R.string.app_name) {
                    id = R.id.tx_time
                    textSize = 13f
                }.lparams(wrapContent, wrapContent)
            }
        }
    }
}