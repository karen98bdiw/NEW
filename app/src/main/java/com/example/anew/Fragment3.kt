package com.example.anew

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*

class Fragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment3_view,container,false)
        return view
    }

}