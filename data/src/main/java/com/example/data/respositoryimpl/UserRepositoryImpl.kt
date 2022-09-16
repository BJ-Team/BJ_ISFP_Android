package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalUserDataSource
import com.example.data.remote.datasource.declaration.RemoteUserDataSource
import com.example.domain.param.user.LoginParam
import com.example.domain.respository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    val remoteUserDataSource: RemoteUserDataSource,
    val localUserDataSource: LocalUserDataSource
): UserRepository{
    override suspend fun login(loginParam: LoginParam) {
        TODO("Not yet implemented")
    }
}