package com.example.data.remote.request.post

import com.example.domain.enums.PostCategoryType
import com.google.gson.annotations.SerializedName

data class PatchPostRequest(
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("category") val category: PostCategoryType,
    @SerializedName("price") val price: Int,
    @SerializedName("post_image") val postImage: String
)
