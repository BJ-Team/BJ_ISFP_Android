package com.example.data.local.datasource.implementation

import com.example.data.local.dao.DailyLifeDao
import com.example.data.local.datasource.declaration.LocalDailyLifeDataSource
import com.example.data.local.roomentity.dailylife.toDbEntity
import com.example.data.local.roomentity.dailylife.toEntity
import com.example.data.local.storage.declaration.AuthDataStorage
import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
import javax.inject.Inject

class LocalDailyLifeDataSourceImpl @Inject constructor(
    private val dailyLifeDao: DailyLifeDao,
    val authDataStorage: AuthDataStorage
): LocalDailyLifeDataSource {
    override suspend fun fetchDailyLifeList(): FetchDailyLifePostEntity =
        dailyLifeDao.fetchDailyLifeList().toEntity()

    override suspend fun saveDailyLifeList(list: FetchDailyLifePostEntity) =
        dailyLifeDao.saveDailyLifeList(list.toDbEntity())
}