package com.example.jetictors.welfare.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.jetictors.welfare.R
import com.example.jetictors.welfare.modle.bean.JsonResult
import org.jetbrains.anko.*

/**
 * 描述    : 妹子页列表adpater
 * author  : Jetictors
 * time    :  2017/11/1 15:04
 * version : v1.0.1
 */
class GirlAdapter (val ctx : Context,private val mData : MutableList<JsonResult>): RecyclerView.Adapter<GirlAdapter.GirlViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): GirlViewHolder {
        return GirlViewHolder(createItemView())
    }

    override fun onBindViewHolder(holder: GirlViewHolder?, position: Int) {
//        if (holder != null) {
//            Glide.with(ctx)
//                    .load(mData.get(position).url)
//                    .into(holder.img)
//        }

    }

    override fun getItemCount(): Int {
        return mData.size
    }

    fun createItemView(): View{

        return with(ctx){
           verticalLayout(){

                imageView(R.mipmap.ic_launcher){
                    id = R.id.girl_img
                }.lparams(wrapContent,dip(270))

           }
        }
    }

    inner class GirlViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
//        var img : ImageView = itemView!!.findViewById(R.id.girl_img)
    }

}