package com.example.data.remote.datasource.declaration

import com.example.data.remote.request.dailylife.CreateDailyLifePostRequest
import com.example.data.remote.request.dailylife.PatchDailyLifePostRequest
import com.example.data.remote.response.dailylife.FetchDailyLifePostResponse
import com.example.domain.enums.DailyLifeType

interface RemoteDailyLifeDataSource {

    suspend fun fetchDailyLifePost(dailyLifeType: DailyLifeType): FetchDailyLifePostResponse

    suspend fun createDailyLifePost(createDailyLifePostRequest: CreateDailyLifePostRequest)

    suspend fun patchDailyLifePost(lifeId: Long, patchDailyLifePostRequest: PatchDailyLifePostRequest)

    suspend fun deleteDailyLifePost(lifeId: Long)
}