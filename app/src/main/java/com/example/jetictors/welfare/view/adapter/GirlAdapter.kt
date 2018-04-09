package com.example.jetictors.welfare.view.adapter

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.modle.bean.JsonResult
import org.jetbrains.anko.*

/**
 * 描述    : 妹子页列表adapter
 * author  : Jetictors
 * time    :  2017/11/1 15:04
 * version : v1.0.1
 */
class GirlAdapter(val ctx: Context, data: MutableList<JsonResult>)
    : BaseQuickAdapter<JsonResult, BaseViewHolder>(data) {

    override fun convert(helper: BaseViewHolder?, item: JsonResult?) {

        helper?.let {
            it.setText(R.id.tx_girl_time, item?.getCreateTime() ?: "")

            val girlImg = it.getView<ImageView>(R.id.iv_girl_img)
            Glide.with(ctx)
                    .load(item?.url)
                    .asBitmap()
                    .placeholder(R.color.clr_eeeeee)
                    .error(R.color.clr_eeeeee)
                    .into(girlImg)
        }

    }

    override fun onCreateDefViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        return BaseViewHolder(createItemView())
    }

    /**
     * 创建itemView
     */
    private fun createItemView(): View {

        return with(ctx) {
            relativeLayout {

                lparams(matchParent, dip(256))

                imageView {
                    id = R.id.iv_girl_img
                    scaleType = ImageView.ScaleType.FIT_XY
                }.lparams(matchParent, matchParent)

                textView {
                    id = R.id.tx_girl_time
                    textColor = ContextCompat.getColor(ctx,R.color.colorAccent)
                    textSize = 13f
                }.lparams(wrapContent, wrapContent) {
                    alignParentBottom()
                    alignParentRight()
                    rightPadding = dip(12)
                    bottomPadding = dip(12)
                }

            }
        }
    }

}