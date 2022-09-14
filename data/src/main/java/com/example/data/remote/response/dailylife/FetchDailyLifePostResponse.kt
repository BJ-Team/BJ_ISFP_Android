package com.example.data.remote.response.dailylife

import com.google.gson.annotations.SerializedName

data class FetchDailyLifePostResponse(
    @SerializedName("life_list") val lifeList: List<LifeList>
) {
    data class LifeList(
        @SerializedName("title") val title: String,
        @SerializedName("content") val content: String,
        @SerializedName("create_time") val createTime: String,
        @SerializedName("life_image") val lifeImage: String,
        @SerializedName("life_id") val lifeId: Long
    )
}
