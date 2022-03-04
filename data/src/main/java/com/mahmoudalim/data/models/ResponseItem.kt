package com.mahmoudalim.data.models

import com.google.gson.annotations.SerializedName


data class ResponseItem(
    @SerializedName("post")
    val post: Post
)