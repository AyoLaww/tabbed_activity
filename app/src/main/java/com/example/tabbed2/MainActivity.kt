package com.example.tabbed2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.tabbed2.ui.main.ViewPagerAdapter
import com.example.tabbed2.ui.main.fragment01
import com.example.tabbed2.ui.main.fragment02
import com.example.tabbed2.ui.main.fragment03
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager //creating object of ViewPager
    private lateinit var tab: TabLayout //creating object of TabLayout
    private lateinit var bar: Toolbar //creating object of ToolBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)

        //To make our toolbar show the application
        //we need to give it to the ActionBar
        setSupportActionBar(bar)

        //initializing the ViewPagerAdapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        //add fragment to the list
        adapter.addFragment(fragment01(), "Law was here")
        adapter.addFragment(fragment02(), "Law was also here")
        adapter.addFragment(fragment03(), "Law was here too")

        //Adding the adapter to the viewPager
        pager.adapter = adapter

        //bind the viewPager with the TabLayout
        tab.setupWithViewPager(pager)
    }
}