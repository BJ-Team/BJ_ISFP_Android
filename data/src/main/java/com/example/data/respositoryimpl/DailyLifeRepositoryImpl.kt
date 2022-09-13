package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalDailyLifeDataSource
import com.example.data.remote.datasource.declaration.RemoteDailyLifeDataSource
import com.example.domain.respository.DailyLifeRepository
import javax.inject.Inject

class DailyLifeRepositoryImpl @Inject constructor(
    val remoteDailyLifeDataSource: RemoteDailyLifeDataSource,
    val localDailyLifeDataSource: LocalDailyLifeDataSource
): DailyLifeRepository {
}