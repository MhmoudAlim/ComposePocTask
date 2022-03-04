package com.mahmoudalim.data.models

import com.google.gson.annotations.SerializedName


data class Statistics(
    @SerializedName("comments")
    val comments: List<Comment>,
    @SerializedName("comments_numbers")
    val commentsNumbers: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("likes_numbers")
    val likesNumbers: Int,
    @SerializedName("shares_numbers")
    val sharesNumbers: Int
)