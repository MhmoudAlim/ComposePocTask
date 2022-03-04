package com.mahmoudalim.data.models

import com.google.gson.annotations.SerializedName


data class User(
    @SerializedName("photo")
    val photo: String,
    @SerializedName("user_name")
    val userName: String
)