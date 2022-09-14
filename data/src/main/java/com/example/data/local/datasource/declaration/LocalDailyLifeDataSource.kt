package com.example.data.local.datasource.declaration

import com.example.domain.entity.dailylife.FetchDailyLifePostEntity

interface LocalDailyLifeDataSource {

    suspend fun fetchDailyLifeList(): FetchDailyLifePostEntity

    suspend fun saveDailyLifeList(list: FetchDailyLifePostEntity)
}