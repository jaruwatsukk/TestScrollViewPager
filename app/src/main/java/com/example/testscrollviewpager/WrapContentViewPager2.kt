package com.example.testscrollviewpager

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.View

class WrapContentViewPager2: ViewPager {

    private var mCurrentView: View? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        if (mCurrentView != null) {
            mCurrentView!!.measure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED))

            val height = Math.max(0, mCurrentView!!.measuredHeight)
            val heightMeasureSpecs = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)

            super.onMeasure(widthMeasureSpec, heightMeasureSpecs)
        }

    }

    fun measureCurrentView(currentView: View) {
        mCurrentView = currentView
        requestLayout()
    }
}

