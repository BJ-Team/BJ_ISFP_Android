package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalDailyLifeDataSource
import com.example.data.remote.datasource.declaration.RemoteDailyLifeDataSource
import com.example.data.remote.request.dailylife.CreateDailyLifePostRequest
import com.example.data.remote.request.dailylife.PatchDailyLifePostRequest
import com.example.data.remote.response.dailylife.FetchDailyLifePostResponse
import com.example.data.remote.response.dailylife.toEntity
import com.example.data.util.OfflineCacheUtil
import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
import com.example.domain.enums.DailyLifeType
import com.example.domain.param.dailylife.CreateDailyLifeParam
import com.example.domain.param.dailylife.PatchDailyLifeParam
import com.example.domain.respository.DailyLifeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DailyLifeRepositoryImpl @Inject constructor(
    private val remoteDailyLifeDataSource: RemoteDailyLifeDataSource,
    private val localDailyLifeDataSource: LocalDailyLifeDataSource
) : DailyLifeRepository {
    override suspend fun fetchDailyLifePost(dailyLifeType: DailyLifeType): Flow<FetchDailyLifePostEntity> =
        OfflineCacheUtil<FetchDailyLifePostEntity>()
            .remoteData {
                remoteDailyLifeDataSource.fetchDailyLifePost(dailyLifeType).toEntity()
            }
            .localData { localDailyLifeDataSource.fetchDailyLifeList() }
            .doOnNeedRefresh { localDailyLifeDataSource.saveDailyLifeList(it) }
            .createFlow()

    override suspend fun createDailyLifePost(
        createDailyLifeParam: CreateDailyLifeParam
    ) = remoteDailyLifeDataSource.createDailyLifePost(createDailyLifeParam.toRequest())

    override suspend fun patchDailyLifePost(
        patchDailyLifeParam: PatchDailyLifeParam
    ) = remoteDailyLifeDataSource.patchDailyLifePost(
        patchDailyLifeParam.lifeId,
        patchDailyLifeParam.toRequest()
    )

    override suspend fun deleteDailyLifePost(
        lifeId: Long
    ) = remoteDailyLifeDataSource.deleteDailyLifePost(lifeId)

    private fun CreateDailyLifeParam.toRequest() =
        CreateDailyLifePostRequest(
            title = title,
            content = content,
            category = category,
            postImage = postImage
        )

    private fun PatchDailyLifeParam.toRequest() =
        PatchDailyLifePostRequest(
            title = title,
            location = title,
            category = category,
            postImage = postImage
        )
}