package com.example.jetictors.welfare.view.adapter

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
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
class GirlAdapter (val ctx : Context, data: MutableList<JsonResult>)
    : BaseQuickAdapter<JsonResult,BaseViewHolder>(data) {

    override fun convert(helper: BaseViewHolder?, item: JsonResult?) {

    }

    override fun createBaseViewHolder(view: View?): BaseViewHolder {
        return BaseViewHolder(createItemView())
    }

    fun createItemView(): View{

        return with(ctx){
           verticalLayout{
                imageView(R.mipmap.ic_launcher){
                    id = R.id.girl_img
                }.lparams(wrapContent,dip(270))
           }
        }
    }

}