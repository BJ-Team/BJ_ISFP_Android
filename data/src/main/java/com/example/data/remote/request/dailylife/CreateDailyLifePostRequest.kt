package com.example.data.remote.request.dailylife

import com.example.domain.enums.DailyLifeType
import com.google.gson.annotations.SerializedName

data class CreateDailyLifePostRequest(
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("category") val category: DailyLifeType,
    @SerializedName("post_image") val postImage: String
)
