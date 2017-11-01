package com.example.jetictors.welfare.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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

    }

    override fun getItemCount(): Int {
        return mData.size
    }

    fun createItemView(): View{
        val img : ImageView

        return with(ctx){
           verticalLayout(){
                imageView(){
                    id = R.id.girl_img
                }.lparams(wrapContent,dip(270)){
                    margin = dip(3)
                }
           }
        }
    }

    inner class GirlViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }

}