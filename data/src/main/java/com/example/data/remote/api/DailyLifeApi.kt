package com.example.data.remote.api

import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST

interface DailyLifeApi {

    @GET(IsFpApiUrl.DailyLife.dailyLifePost)
    suspend fun fetchDailyLifePost()

    @POST(IsFpApiUrl.DailyLife.dailyLifePost)
    suspend fun createDailyLifePost()

    @PATCH(IsFpApiUrl.DailyLife.dailyLifePost)
    suspend fun patchMyDailyLifePost()

    @DELETE(IsFpApiUrl.DailyLife.dailyLifePost)
    suspend fun deleteMyDailyLifePost()
}