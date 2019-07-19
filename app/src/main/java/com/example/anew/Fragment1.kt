package com.example.anew

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.anew.RealTimeNewsParser.RealTimeNewsBaseModel
import kotlinx.android.synthetic.main.fragment1_view.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Fragment1 : Fragment(){

    

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.fragment1_view,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val retrofit = Retrofit.Builder()
            .baseUrl(Utils.REAL_TIME_NEWS_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val requestInterface = retrofit.create(ArticlesRequestInterface::class.java)

        val call = requestInterface.getNews(Utils.NEWS_API_KEY)

        call.enqueue(object :retrofit2.Callback<RealTimeNewsBaseModel>{
            override fun onFailure(call: Call<RealTimeNewsBaseModel>, t: Throwable) {
                Log.e("onResponseFail","failr")
                t.printStackTrace()
            }

            override fun onResponse(call: Call<RealTimeNewsBaseModel>, response: Response<RealTimeNewsBaseModel>) {

                    for(i in response.body()!!.results){
                        Log.e("response","tittle:${i.title}|desc${i.abstract}|img:${i.multimedia.get(0).url}")
                    }

                    val adapter = ArticlesRecyclerViewAdapter(response!!.body()!!.results,this@Fragment1.context!!)
                    val layoutManager = LinearLayoutManager(this@Fragment1.context,LinearLayoutManager.VERTICAL,false)

                    articlesRecyclerView.layoutManager = layoutManager
                    articlesRecyclerView.adapter = adapter
            }

        })

    }





}