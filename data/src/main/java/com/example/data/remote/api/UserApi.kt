package com.example.data.remote.api

import com.example.data.remote.request.user.UserPatchPasswordRequest
import com.example.data.remote.request.user.UserSignInRequest
import com.example.data.remote.request.user.UserSignUpRequest
import com.example.data.remote.response.user.UserReissueResponse
import com.example.data.remote.response.user.UserSignInResponse
import com.example.data.remote.url.IsFpApiUrl
import com.google.gson.annotations.SerializedName
import retrofit2.http.*

interface UserApi {
    @POST(IsFpApiUrl.User.login)
    suspend fun login(
        @Body userSignInRequest: UserSignInRequest
    ): UserSignInResponse

    @POST(IsFpApiUrl.User.register)
    suspend fun register(
        @Body userSignUpRequest: UserSignUpRequest
    )

    @POST(IsFpApiUrl.User.nameOverlapCheck)
    suspend fun nameOverlapCheck(
        @Query("name") name: String
    )

    @PATCH(IsFpApiUrl.User.patchPassword)
    suspend fun patchPassword(
        @Body userPatchPasswordRequest: UserPatchPasswordRequest
    )

    @PATCH(IsFpApiUrl.User.patchMyLocation)
    suspend fun patchMyLocation(
        @Body place: String
    )

    @POST(IsFpApiUrl.Auth.refreshToken)
    suspend fun refreshToken(
        @Header("refresh_token") refreshToken: String
    ): UserReissueResponse
}