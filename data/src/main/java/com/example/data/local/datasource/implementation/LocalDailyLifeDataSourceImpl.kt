package com.example.data.local.datasource.implementation

import com.example.data.local.dao.DailyLifeDao
import com.example.data.local.datasource.declaration.LocalDailyLifeDataSource
import com.example.data.local.storage.declaration.AuthDataStorage
import javax.inject.Inject

class LocalDailyLifeDataSourceImpl @Inject constructor(
    val dailyLifeDao: DailyLifeDao,
    val authDataStorage: AuthDataStorage
): LocalDailyLifeDataSource {
}