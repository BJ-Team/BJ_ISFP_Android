package com.example.domain.entity.dailylife


data class FetchDailyLifePostEntity(
    val lifeList: LifeList
) {
    data class LifeList(
        val title: String,
        val content: String,
        val createTime: String,
        val lifeImage: String,
        val lifeId: Long
    )
}
