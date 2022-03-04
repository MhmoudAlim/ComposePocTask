package com.mahmoudalim.data.models


import com.google.gson.annotations.SerializedName
import com.mahmoudalim.data.enums.PostType


data class NestedPost(
    @SerializedName("author")
    val author: Author?,
    @SerializedName("post_description")
    val postDescription: String,
    @SerializedName("post_footer")
    val postFooter: PostFooter,
    @SerializedName("post_images")
    val postImages: List<String>,
    @SerializedName("statistics")
    val statistics: Statistics,
    @SerializedName("type")
    val type: String
){

    val postType: PostType
        get() = PostType.fromType(type)
}