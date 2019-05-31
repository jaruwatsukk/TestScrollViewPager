package com.example.testscrollviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup

class BotViewPagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {

    private var mCurrentPosition = -1
    private lateinit var tabName: Array<String>

    fun setTabName(tabName :Array<String>){
        this.tabName = tabName
    }

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> BotFragment1()
            else -> BotFragment2()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabName[position]
    }


    override fun setPrimaryItem(container: ViewGroup, position: Int, `object`: Any) {
        super.setPrimaryItem(container, position, `object`)

        if (position != mCurrentPosition && container is WrapContentViewPager2) {
            val fragment = `object` as Fragment
            if (fragment.view != null) {
                mCurrentPosition = position
                container.measureCurrentView(fragment.view!!)
            }
        }
    }
}
