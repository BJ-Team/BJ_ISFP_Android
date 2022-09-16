package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalDailyLifeDataSource
import com.example.data.remote.datasource.declaration.RemoteDailyLifeDataSource
import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
import com.example.domain.enums.DailyLifeType
import com.example.domain.param.dailylife.CreateDailyLifeParam
import com.example.domain.param.dailylife.PatchDailyLifeParam
import com.example.domain.respository.DailyLifeRepository
import javax.inject.Inject

class DailyLifeRepositoryImpl @Inject constructor(
    val remoteDailyLifeDataSource: RemoteDailyLifeDataSource,
    val localDailyLifeDataSource: LocalDailyLifeDataSource
): DailyLifeRepository {
    override suspend fun fetchDailyLifePost(dailyLifeType: DailyLifeType): FetchDailyLifePostEntity {
        TODO("Not yet implemented")
    }

    override suspend fun createDailyLifePost(createDailyLifeParam: CreateDailyLifeParam) {
        TODO("Not yet implemented")
    }

    override suspend fun patchDailyLifePost(
        lifeId: Long,
        patchDailyLifeParam: PatchDailyLifeParam
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteDailyLifePost(lifeId: Long) {
        TODO("Not yet implemented")
    }
}