package com.example.data.remote.datasource.implementation

import com.example.data.remote.api.DailyLifeApi
import com.example.data.remote.datasource.declaration.RemoteDailyLifeDataSource
import com.example.data.remote.request.dailylife.CreateDailyLifePostRequest
import com.example.data.remote.request.dailylife.PatchDailyLifePostRequest
import com.example.data.remote.request.post.CreatePostRequest
import com.example.data.remote.response.dailylife.FetchDailyLifePostResponse
import com.example.data.util.HttpHandler
import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
import com.example.domain.enums.DailyLifeType
import com.example.domain.param.dailylife.CreateDailyLifeParam
import javax.inject.Inject

class RemoteDailyLifeDataSourceImpl @Inject constructor(
    private val dailyLifeApi: DailyLifeApi
) : RemoteDailyLifeDataSource {

    override suspend fun fetchDailyLifePost(
        dailyLifeType: DailyLifeType
    ): FetchDailyLifePostResponse = HttpHandler<FetchDailyLifePostResponse>()
        .httpRequest { dailyLifeApi.fetchDailyLifePost(dailyLifeType) }
        .sendRequest()

    override suspend fun createDailyLifePost(
        createDailyLifePostRequest: CreateDailyLifePostRequest
    ) = HttpHandler<Unit>()
        .httpRequest { dailyLifeApi.createDailyLifePost(createDailyLifePostRequest) }
        .sendRequest()

    override suspend fun patchDailyLifePost(
        lifeId: Long,
        patchDailyLifePostRequest: PatchDailyLifePostRequest
    ) = HttpHandler<Unit>()
        .httpRequest {
            dailyLifeApi.patchMyDailyLifePost(
                lifeId,
                patchDailyLifePostRequest,
            )
        }
        .sendRequest()

    override suspend fun deleteDailyLifePost(
        lifeId: Long
    ) = HttpHandler<Unit>()
        .httpRequest { dailyLifeApi.deleteMyDailyLifePost(lifeId) }
        .sendRequest()
}