package com.example.jetictors.welfare.modle.bean

/**
 * 描述    : 数据类基类
 * author  : Jetictors
 * time    :  2017/11/1 15:18
 * version : v1.0.1
 */
class BaseBean<out T>(val error : Boolean, val results : T)