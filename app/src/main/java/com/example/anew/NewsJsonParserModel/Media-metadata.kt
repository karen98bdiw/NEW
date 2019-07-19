package com.example.anew.NewsJsonParserModel

import com.google.gson.annotations.SerializedName

data class `Media-metadata` (
    @SerializedName("url") val url : String,
    @SerializedName("format") val format : String,
    @SerializedName("height") val height : Int,
    @SerializedName("width") val width : Int
)