package com.example.domain.param.dailylife

import com.example.domain.enums.DailyLifeType

data class PatchDailyLifeParam (
    val lifeId: Long,
    val title: String,
    val location: String,
    val category: DailyLifeType,
    val postImage: String
)
