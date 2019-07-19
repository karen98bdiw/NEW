package com.example.anew


import com.example.anew.NewsJsonParserModel.Media
import com.example.anew.NewsJsonParserModel.`Media-metadata`
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


 data class Results(

     @SerializedName("url") val url : String,
     @SerializedName("adx_adx_keywordswords") val adx_adx_keywordswords : String,
     @SerializedName("subsection") val subsection : String,
     @SerializedName("email_count") val email_count : Int,
     @SerializedName("count_type") val count_type : String,
     @SerializedName("column") val column : String,
     @SerializedName("eta_id") val eta_id : Int,
     @SerializedName("section") val section : String,
     @SerializedName("id") val id : Long,
     @SerializedName("asset_id") val asset_id : Long,
     @SerializedName("nytdsection") val nytdsection : String,
     @SerializedName("byline") val byline : String,
     @SerializedName("type") val type : String,
     @SerializedName("title") val title : String,
     @SerializedName("abstract") val abstract : String,
     @SerializedName("published_date") val published_date : String,
     @SerializedName("source") val source : String,
     @SerializedName("updated") val updated : String,
//	@SerializedName("des_facet") val des_facet : List<String>,
//	@SerializedName("org_facet") val org_facet : List<String>,
//	@SerializedName("per_facet") val per_facet : List<String>,
//	@SerializedName("geo_facet") val geo_facet : List<String>,
     @SerializedName("media") val media : List<Media>,
     @SerializedName("uri") val uri : String
 ):Serializable