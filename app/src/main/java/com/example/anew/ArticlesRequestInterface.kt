package com.example.anew

import com.example.anew.RealTimeNewsParser.RealTimeNewsBaseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticlesRequestInterface {

    @GET("all.json")
    abstract fun getNews(@Query("api-key") key:String):Call<RealTimeNewsBaseModel>


}