package com.example.data.remote.datasource.implementation

import com.example.data.remote.api.UserApi
import com.example.data.remote.datasource.declaration.RemoteUserDataSource
import com.example.data.remote.request.user.UserSignInRequest
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
}