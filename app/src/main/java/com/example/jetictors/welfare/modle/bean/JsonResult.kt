package com.example.jetictors.welfare.modle.bean

/**
 * 描述    : 接口返回数据类
 * 查看接口返回数据发现，不管是福利、ios、android等返回的数据json格式都是一样的，故而只创建一个bean对象
 * author  : Jetictors
 * time    :  2017/11/1 15:46
 * version : v1.0.1
 */
data class JsonResult(
        val _id: String,
        val createdAt: String,
        val desc: String,
        val images: Array<String>,
        val publishedAt: String,
        val source: String,
        val type: String,
        val url: String,
        val used: Boolean,
        val who: String
){

    /**
     * 判断images这个字段存不存在
     */
    fun imagesIsNull() : Boolean{
        if (images == null){
            return true
        }

        return false
    }

    fun getCreateTime() = createdAt.substring(0,10)
}
