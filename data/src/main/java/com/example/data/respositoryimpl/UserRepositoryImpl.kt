package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalUserDataSource
import com.example.data.remote.datasource.declaration.RemoteUserDataSource
import com.example.domain.entity.user.FetchReIssueEntity
import com.example.domain.param.user.LoginParam
import com.example.domain.param.user.PatchPassWordParam
import com.example.domain.param.user.RegisterParam
import com.example.domain.respository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    val remoteUserDataSource: RemoteUserDataSource,
    val localUserDataSource: LocalUserDataSource
): UserRepository{

    override suspend fun signIn(loginParam: LoginParam) {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(registerParam: RegisterParam) {
        TODO("Not yet implemented")
    }

    override suspend fun nameOverLapCheck(name: String) {
        TODO("Not yet implemented")
    }

    override suspend fun patchPassWord(patchPassWordParam: PatchPassWordParam) {
        TODO("Not yet implemented")
    }

    override suspend fun patchMyLocation(location: String) {
        TODO("Not yet implemented")
    }

    override suspend fun refreshToken(token: String): FetchReIssueEntity {
        TODO("Not yet implemented")
    }
}