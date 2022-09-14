package com.example.domain.entity.dailylife


data class FetchDailyLifePostEntity(
    val lifeList: List<LifeList>
) {
    data class LifeList(
        val lifeId: Long,
        val title: String,
        val content: String,
        val createTime: String,
        val lifeImage: String
    )
}
