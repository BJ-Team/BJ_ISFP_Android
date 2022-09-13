package com.example.data.remote.datasource.implementation

import com.example.data.remote.api.UserApi
import com.example.data.remote.datasource.declaration.RemoteUserDataSource
import com.example.data.remote.request.user.UserPatchPasswordRequest
import com.example.data.remote.request.user.UserSignInRequest
import com.example.data.remote.request.user.UserSignUpRequest
import com.example.data.remote.response.user.UserReissueResponse
import com.example.data.remote.response.user.UserSignInResponse
import com.example.data.util.HttpHandler
import javax.inject.Inject

class RemoteUserDataSourceImpl @Inject constructor(
    private val userApi: UserApi
): RemoteUserDataSource {
    override suspend fun postUserSignIn(
        userSignInRequest: UserSignInRequest
    ) = HttpHandler<UserSignInResponse>()
        .httpRequest { userApi.login(userSignInRequest) }
        .sendRequest()

    override suspend fun postUserSignUp(
        userSignUpRequest: UserSignUpRequest
    ) = HttpHandler<Unit>()
        .httpRequest { userApi.register(userSignUpRequest) }
        .sendRequest()

    override suspend fun nameOverlapCheck(
        name: String
    )= HttpHandler<Unit>()
        .httpRequest { userApi.nameOverlapCheck(name) }
        .sendRequest()

    override suspend fun patchPassWord(
        userPatchPasswordRequest: UserPatchPasswordRequest
    )= HttpHandler<Unit>()
        .httpRequest { userApi.patchPassword(userPatchPasswordRequest) }
        .sendRequest()

    override suspend fun patchMyLocation(
        location: String
    )= HttpHandler<Unit>()
        .httpRequest { userApi.patchMyLocation(location) }
        .sendRequest()


    override suspend fun refreshToken(
        token: String
    )= HttpHandler<UserReissueResponse>()
        .httpRequest { userApi.refreshToken(token) }
        .sendRequest()
}