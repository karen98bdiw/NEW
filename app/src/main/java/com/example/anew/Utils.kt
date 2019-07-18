package com.example.anew

import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager

class Utils {

    companion object {

        fun constructMainViewPager(viewPager: ViewPager,fm:FragmentManager){
            val mainPagesAdapter = MainPagesAdapter(fm)
            mainPagesAdapter.addFragment(Fragment1(),"first")
            mainPagesAdapter.addFragment(Fragment2(),"secont")
            mainPagesAdapter.addFragment(Fragment3(),"third")
            viewPager.adapter = mainPagesAdapter
        }

    }

}