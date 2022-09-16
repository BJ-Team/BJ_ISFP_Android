package com.example.domain.param.dailylife

import com.example.domain.enums.DailyLifeType

data class CreateDailyLifeParam (
    val title: String,
    val content: String,
    val category: DailyLifeType,
    val postImage: String
)
