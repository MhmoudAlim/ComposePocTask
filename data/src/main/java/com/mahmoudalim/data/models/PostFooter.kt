package com.mahmoudalim.data.models

import com.google.gson.annotations.SerializedName


data class PostFooter(
    @SerializedName("category")
    val category: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("image")
    val image: String,
)