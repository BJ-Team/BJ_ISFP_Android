package com.example.data.remote.request.dailylife

import com.example.domain.enums.DailyLifeType
import com.google.gson.annotations.SerializedName

data class PatchDailyLifePostRequest(
    @SerializedName("title") val title: String,
    @SerializedName("location") val location: String,
    @SerializedName("category") val category: DailyLifeType,
    @SerializedName("post_image") val postImage: String
)
