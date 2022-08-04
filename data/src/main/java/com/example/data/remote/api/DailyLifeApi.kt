package com.example.data.remote.api

import com.example.data.remote.request.dailylife.CreateDailyLifePostRequest
import com.example.data.remote.request.dailylife.PatchDailyLifePostRequest
import com.example.data.remote.response.dailylife.FetchDailyLifePostResponse
import com.example.data.remote.url.IsFpApiUrl
import com.example.domain.enums.DailyLifeType
import retrofit2.http.*

interface DailyLifeApi {

    @GET(IsFpApiUrl.DailyLife.dailyLifePost)
    suspend fun fetchDailyLifePost(
        @Header("Authorization") accessToken: String,
        @Body dailyLifeType: DailyLifeType
    ): FetchDailyLifePostResponse

    @POST(IsFpApiUrl.DailyLife.dailyLifePost)
    suspend fun createDailyLifePost(
        @Header("Authorization") accessToken: String,
        @Body createDailyLifePostRequest: CreateDailyLifePostRequest
    )

    @PATCH(IsFpApiUrl.DailyLife.editDailyLifePost)
    suspend fun patchMyDailyLifePost(
        @Path("life-id") lifeId: Long,
        @Body patchDailyLifePostRequest: PatchDailyLifePostRequest
    )

    @DELETE(IsFpApiUrl.DailyLife.editDailyLifePost)
    suspend fun deleteMyDailyLifePost(
        @Path("life-id") lifeId: Long
    )
}