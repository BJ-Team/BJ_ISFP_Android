package com.example.data.remote.request.post

import com.google.gson.annotations.SerializedName

data class PostReportRequest(
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("post_id") val postId: Long
)
