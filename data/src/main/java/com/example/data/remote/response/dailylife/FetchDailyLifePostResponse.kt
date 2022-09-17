package com.example.data.remote.response.dailylife

import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
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

fun FetchDailyLifePostResponse.toEntity() =
    FetchDailyLifePostEntity(
        lifeList = lifeList.map { it.toEntity() }
    )

fun FetchDailyLifePostResponse.LifeList.toEntity() =
    FetchDailyLifePostEntity.LifeList(
        lifeId = lifeId,
        title = title,
        content = content,
        createTime = createTime,
        lifeImage = lifeImage
    )
