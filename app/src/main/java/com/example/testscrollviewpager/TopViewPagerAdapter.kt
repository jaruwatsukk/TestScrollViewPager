package com.example.testscrollviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter


class TopViewPagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {


    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> TopFragment1()
            else -> TopFragment2()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}
