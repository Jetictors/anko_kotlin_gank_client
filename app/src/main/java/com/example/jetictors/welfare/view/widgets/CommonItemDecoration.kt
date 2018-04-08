package com.example.jetictors.welfare.view.widgets

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout

/**
 * 描述    : 线性布局管理器通用的recyclerView分割线
 * author  : Jetictors
 * time    :  2017/11/3 14:35
 * version : v1.0.1
 */
class CommonItemDecoration : RecyclerView.ItemDecoration {

    private var mContext: Context? = null

    /**
     * 分割线高度
     */
    private var mDividerHeight: Int = 0

    /**
     * 分割线颜色
     */
    private var mDividerColor: Int = 0

    /**
     * 是否显示最后一行或最后一列的分割线
     */
    private var isShowLastLine: Boolean = false

    /**
     * 方向
     */
    private var mOrientation: Int = 0

    private var mPaint: Paint = Paint()

    constructor(context: Context) {
        this.mContext = context
        this.mDividerColor = Color.parseColor("#eeeded")
        this.isShowLastLine = false
        this.mDividerHeight = 1
        this.mOrientation = VERTICAL
    }

    constructor(mContext: Context, mDividerHeight: Int, mDividerColor: Int,
                isShowLastLine: Boolean, mOrientation: Int) {
        this.mContext = mContext
        this.mDividerHeight = mDividerHeight
        this.mDividerColor = mDividerColor
        this.isShowLastLine = isShowLastLine
        this.mOrientation = mOrientation
    }

    init{
        mPaint.style = Paint.Style.FILL
        mPaint.isAntiAlias = true
        mPaint.color = mDividerColor
    }

    /**
     * 设置分割线方向
     * @param orientation 方向
     */
    fun setOrientation(orientation: Int) {
        if (orientation != HORIZONTAL && orientation != VERTICAL) {
            mOrientation = VERTICAL
            return
        }
        mOrientation = orientation
    }

    /**
     * 设置分割线的高度
     * @param dividerHeight 高度
     */
    fun setDividerHeight(dividerHeight: Int) {
        if (dividerHeight <= 0) {
            mDividerHeight = 1
            return
        }

        this.mDividerHeight = dividerHeight
    }

    /**
     * 设置最后一行数据的分割线是否显示
     * @param isShow 是否显示
     */
    fun setShowLastLine(isShow: Boolean) {
        this.isShowLastLine = isShow
    }

    /**
     * 设置分割线的颜色
     * @param dividerColor
     */
    fun setDividerColor(dividerColor: Int) {
        if (dividerColor == -1) {
            this.mDividerColor = Color.parseColor("#eeeded")
            return
        }
        this.mDividerColor = dividerColor
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State?) {
        if (parent.layoutManager == null) {
            return
        }

        if (mOrientation == VERTICAL) {
            drawVertical(c, parent)
        } else {
            drawHorizontal(c, parent)
        }
    }

    @SuppressLint("NewApi")
    private fun drawVertical(canvas: Canvas, parent: RecyclerView) {
        canvas.save()
        val left: Float
        val right: Float
        if (parent.clipToPadding) {
            left = parent.paddingLeft.toFloat()
            right = (parent.width - parent.paddingRight).toFloat()
            canvas.clipRect(left, parent.paddingTop.toFloat(), right,
                    (parent.height - parent.paddingBottom).toFloat())
        } else {
            left = 0f
            right = parent.width.toFloat()
        }

        val childCount = parent.childCount
        if (isShowLastLine) {
            for (i in 0 until childCount) {
                val child = parent.getChildAt(i)
                val bottom = (mDividerHeight + child.bottom).toFloat()
                canvas.drawRect(left, child.bottom.toFloat(), right, bottom, mPaint)
            }
        } else {
            for (i in 0 until childCount - 1) {
                val child = parent.getChildAt(i)
                val bottom = (mDividerHeight + child.bottom).toFloat()
                canvas.drawRect(left, child.bottom.toFloat(), right, bottom, mPaint)
            }
        }
        canvas.restore()
    }

    @SuppressLint("NewApi")
    private fun drawHorizontal(canvas: Canvas, parent: RecyclerView) {
        canvas.save()
        val top: Int
        val bottom: Int
        if (parent.clipToPadding) {
            top = parent.paddingTop
            bottom = parent.height - parent.paddingBottom
            canvas.clipRect(parent.paddingLeft, top,
                    parent.width - parent.paddingRight, bottom)
        } else {
            top = 0
            bottom = parent.height
        }

        val childCount = parent.childCount
        if (isShowLastLine) {
            for (i in 0 until childCount) {
                val child = parent.getChildAt(i)
                val right = (mDividerHeight + child.right).toFloat()
                val left = child.left.toFloat()
                canvas.drawRect(child.right.toFloat(), top.toFloat(), right, bottom.toFloat(), mPaint)
            }
        } else {
            for (i in 0 until childCount - 1) {
                val child = parent.getChildAt(i)
                val right = (mDividerHeight + child.right).toFloat()
                val left = child.left.toFloat()
                canvas.drawRect(child.right.toFloat(), top.toFloat(), right, bottom.toFloat(), mPaint)
            }
        }
        canvas.restore()
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                                state: RecyclerView.State?) {
        if (mOrientation == VERTICAL) {
            outRect.set(0, 0, 0, mDividerHeight)
        } else {
            outRect.set(0, 0, mDividerHeight, 0)
        }
    }

    companion object {
        val HORIZONTAL = LinearLayout.HORIZONTAL
        val VERTICAL = LinearLayout.VERTICAL
    }
}
