package com.simplemobiletools.notes.pro.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.HorizontalScrollView

class MyHorizontalScrollView : HorizontalScrollView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent): Boolean {
        parent.requestDisallowInterceptTouchEvent(false)
        return super.onTouchEvent(ev)
    }
}
