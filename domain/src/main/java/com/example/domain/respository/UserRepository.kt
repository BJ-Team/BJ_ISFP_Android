package com.example.domain.respository

import com.example.domain.entity.user.FetchReIssueEntity
import com.example.domain.param.user.LoginParam
import com.example.domain.param.user.PatchPassWordParam
import com.example.domain.param.user.RegisterParam

interface UserRepository {
    suspend fun signIn(loginParam: LoginParam)

    suspend fun signUp(registerParam: RegisterParam)

    suspend fun nameOverLapCheck(name: String)

    suspend fun patchPassWord(patchPassWordParam: PatchPassWordParam)

    suspend fun patchMyLocation(location: String)

    suspend fun refreshToken(token: String): FetchReIssueEntity
}