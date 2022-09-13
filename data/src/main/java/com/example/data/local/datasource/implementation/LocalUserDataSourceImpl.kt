package com.example.data.local.datasource.implementation

import com.example.data.local.datasource.declaration.LocalUserDataSource
import com.example.data.local.storage.declaration.AuthDataStorage
import java.time.LocalDateTime
import javax.inject.Inject

class LocalUserDataSourceImpl @Inject constructor(
    private val authDataStorage: AuthDataStorage
): LocalUserDataSource {
    override suspend fun setAccessToken(token: String) {
        authDataStorage.setAccessToken(token)
    }

    override suspend fun fetchAccessToken(): String =
        authDataStorage.fetchAccessToken()

    override suspend fun clearAccessToken() {
        authDataStorage.clearAccessToken()
    }

    override suspend fun setRefreshToken(token: String) {
        authDataStorage.setRefreshToken(token)
    }

    override suspend fun fetchRefreshToken(): String =
        authDataStorage.fetchRefreshToken()

    override suspend fun clearRefreshToken() {
        authDataStorage.clearRefreshToken()
    }

    override suspend fun setExpiredAt(localDateTime: String) {
        authDataStorage.setExpiredAt(localDateTime)
    }

    override suspend fun fetchExpiredAt(): LocalDateTime =
        authDataStorage.fetchExpiredAt()

}