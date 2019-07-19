package com.example.anew

import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager

class Utils {

    companion object {

        val NEWS_API_BASE_URL = "https://api.nytimes.com/svc/mostpopular/v2/emailed/"
        val REAL_TIME_NEWS_BASE_URL = "https://api.nytimes.com/svc/news/v3/content/all/"
        val NEWS_API_KEY = "eqPZhtMDSGS1MHqeeWALczfD1G8qCaGT"

        var REQUEST_CALLED = false

        fun constructMainViewPager(viewPager: ViewPager,fm:FragmentManager){
            val mainPagesAdapter = MainPagesAdapter(fm)
            mainPagesAdapter.addFragment(Fragment1(),"first")
            mainPagesAdapter.addFragment(Fragment2(),"secont")
            mainPagesAdapter.addFragment(Fragment3(),"third")
            viewPager.adapter = mainPagesAdapter
        }

    }

}