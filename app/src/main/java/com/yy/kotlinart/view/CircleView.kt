package com.yy.kotlinart.view

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.yy.kotlinart.R

class CircleView : View {
    var paint: Paint? = null
    var color: Int = Color.RED

    constructor(context: Context, attrs: AttributeSet?, defStylesAttr: Int) : super(
        context,
        attrs,
        defStylesAttr
    ) {
        paint = Paint(Paint.ANTI_ALIAS_FLAG)
        var type: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.CircleView)
        color = type.getColor(R.styleable.CircleView_bg_color, Color.RED)
        type.recycle()
        paint!!.setColor(color)
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {

    }

    constructor(context: Context) : this(context, null) {

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        var widthSpecMode = MeasureSpec.getMode(widthMeasureSpec)
        var widthSpecSize = MeasureSpec.getSize(widthMeasureSpec)
        var heightSpecMode = MeasureSpec.getMode(heightMeasureSpec)
        var heightSpecSize = MeasureSpec.getSize(heightMeasureSpec)
        if (widthSpecMode == MeasureSpec.AT_MOST && heightSpecMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(500, 500)
        } else if (widthMeasureSpec == MeasureSpec.AT_MOST) {
            setMeasuredDimension(500, heightSpecSize)
        } else if (heightMeasureSpec == MeasureSpec.AT_MOST) {
            setMeasuredDimension(widthSpecSize, 500)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var mHeight: Int = height - paddingTop - paddingBottom
        var mWidth: Int = width - paddingLeft - paddingRight
        var radius = Math.min(mHeight, mWidth) / 2
        canvas?.drawCircle(
            (paddingLeft + mWidth / 2).toFloat(),
            (paddingTop + mHeight / 2).toFloat(), radius.toFloat(), paint!!
        )

        
    }

}