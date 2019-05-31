package com.example.testscrollviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topAdapter = TopViewPagerAdapter(supportFragmentManager)

        topViewPager.adapter = topAdapter

        val botAdapter = BotViewPagerAdapter(supportFragmentManager)
        botAdapter.setTabName(listOf("1","2").toTypedArray())
        botViewPager.adapter = botAdapter

        tabLayout.setupWithViewPager(botViewPager)
    }
}
