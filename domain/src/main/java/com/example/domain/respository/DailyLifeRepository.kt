package com.example.domain.respository

import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
import com.example.domain.enums.DailyLifeType
import com.example.domain.param.dailylife.CreateDailyLifeParam
import com.example.domain.param.dailylife.PatchDailyLifeParam

interface DailyLifeRepository {

    suspend fun fetchDailyLifePost(dailyLifeType: DailyLifeType): FetchDailyLifePostEntity

    suspend fun createDailyLifePost(createDailyLifeParam: CreateDailyLifeParam)

    suspend fun patchDailyLifePost(lifeId: Long, patchDailyLifeParam: PatchDailyLifeParam)

    suspend fun deleteDailyLifePost(lifeId: Long)
}