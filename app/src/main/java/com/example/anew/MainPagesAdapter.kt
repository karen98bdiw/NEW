package com.example.anew

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MainPagesAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    val fragmentList = arrayListOf<Fragment>()
    val fragmentTittleList = arrayListOf<String>()

    override fun getItem(p0: Int): Fragment {
        return fragmentList.get(p0)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTittleList.get(position)
    }

    fun addFragment(f:Fragment,t:String){
        fragmentList.add(f)
        fragmentTittleList.add(t)
    }
}