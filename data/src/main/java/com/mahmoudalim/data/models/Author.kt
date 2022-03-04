package com.mahmoudalim.data.models

import com.google.gson.annotations.SerializedName
import com.mahmoudalim.data.enums.AuthorType


data class Author(
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String
) {

    val authorType: AuthorType
        get() = AuthorType.fromType(type)
}