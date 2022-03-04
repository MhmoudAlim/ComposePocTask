package com.mahmoudalim.data.models

import com.google.gson.annotations.SerializedName


data class Comment(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("likes")
    val likes: Int,
    @SerializedName("user")
    val user: User
)