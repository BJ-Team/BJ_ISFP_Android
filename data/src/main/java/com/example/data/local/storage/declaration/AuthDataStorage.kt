package com.example.data.local.storage.declaration

import java.time.LocalDateTime

interface AuthDataStorage {

    fun setAccessToken(token: String)
    fun fetchAccessToken(): String
    fun clearAccessToken()

    fun setRefreshToken(token: String)
    fun fetchRefreshToken(): String
    fun clearRefreshToken()

    fun setExpiredAt(localDateTime: String)
    fun fetchExpiredAt(): LocalDateTime
}