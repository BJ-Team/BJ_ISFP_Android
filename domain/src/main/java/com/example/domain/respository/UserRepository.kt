package com.example.domain.respository

import com.example.domain.param.LoginParam

interface UserRepository {
    suspend fun login(loginParam: LoginParam)
}