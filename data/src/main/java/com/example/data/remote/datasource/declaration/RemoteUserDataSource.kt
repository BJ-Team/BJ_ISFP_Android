package com.example.data.remote.datasource.declaration

import com.example.data.remote.request.user.UserSignInRequest
import com.example.data.remote.response.user.UserSignInResponse

interface RemoteUserDataSource {
    suspend fun postUserSignIn(
        userSignInRequest: UserSignInRequest
    ): UserSignInResponse
}