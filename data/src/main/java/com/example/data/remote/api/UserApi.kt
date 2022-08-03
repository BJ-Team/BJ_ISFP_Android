package com.example.data.remote.api

import retrofit2.http.POST
import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.PATCH
import retrofit2.http.Path

interface UserApi {
    @POST(IsFpApiUrl.User.login)
    suspend fun login()

    @POST(IsFpApiUrl.User.register)
    suspend fun register()

    @POST(IsFpApiUrl.User.nameOverlapCheck)
    suspend fun nameOverlapCheck()

    @PATCH(IsFpApiUrl.User.patchPassword)
    suspend fun patchPassword()

    @PATCH(IsFpApiUrl.User.patchMyLocation)
    suspend fun patchMyLocation()

    @POST(IsFpApiUrl.Auth.refreshToken)
    suspend fun refreshToken()
}