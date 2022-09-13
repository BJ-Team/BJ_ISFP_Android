package com.example.data.remote.datasource.declaration

import com.example.data.remote.request.user.UserPatchPasswordRequest
import com.example.data.remote.request.user.UserSignInRequest
import com.example.data.remote.request.user.UserSignUpRequest
import com.example.data.remote.response.user.UserReissueResponse
import com.example.data.remote.response.user.UserSignInResponse

interface RemoteUserDataSource {
    suspend fun postUserSignIn(userSignInRequest: UserSignInRequest): UserSignInResponse

    suspend fun postUserSignUp(userSignUpRequest: UserSignUpRequest)

    suspend fun nameOverlapCheck(name: String)

    suspend fun patchPassWord(userPatchPasswordRequest: UserPatchPasswordRequest)

    suspend fun patchMyLocation(location: String)

    suspend fun refreshToken(token: String): UserReissueResponse
}