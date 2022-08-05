package com.example.data.local.storage.implementation

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.preference.PreferenceManager
import com.example.data.local.storage.declaration.AuthDataStorage
import com.example.data.local.storage.implementation.AuthDataStorageImpl.Key.ACCESS_TOKEN
import com.example.data.local.storage.implementation.AuthDataStorageImpl.Key.REFRESH_TOKEN
import com.example.data.local.storage.implementation.AuthDataStorageImpl.Key.EXPIRED_AT
import com.example.data.util.toLocalDateTime
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDateTime
import javax.inject.Inject

class AuthDataStorageImpl @Inject constructor(
    @ApplicationContext private val context: Context
): AuthDataStorage {
    override fun setAccessToken(token: String) {
        getSharedPreference().edit().let {
            it.putString(ACCESS_TOKEN, token)
            it.apply()
        }
    }

    override fun fetchAccessToken(): String =
        getSharedPreference().getString(ACCESS_TOKEN, "empty")!!

    override fun clearAccessToken() {
        getSharedPreference().edit().let {
            it.remove(ACCESS_TOKEN)
            it.apply()
        }
    }

    override fun setRefreshToken(token: String) {
        getSharedPreference().edit().let {
            it.putString(REFRESH_TOKEN, "empty")
            it.apply()
        }
    }

    override fun fetchRefreshToken(): String =
        getSharedPreference().getString(REFRESH_TOKEN, "empty")!!

    override fun clearRefreshToken() {
        getSharedPreference().edit().let {
            it.remove(REFRESH_TOKEN)
            it.apply()
        }
    }

    override fun setExpiredAt(localDateTime: String) {
        getSharedPreference().edit().let {
            it.putString(EXPIRED_AT, localDateTime)
            it.apply()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun fetchExpiredAt(): LocalDateTime =
        getSharedPreference().getString(EXPIRED_AT, LocalDateTime.now().toString())?.toLocalDateTime()!!

    private fun getSharedPreference() =
        PreferenceManager.getDefaultSharedPreferences(context)

    private object Key {
        const val ACCESS_TOKEN = "ACCESS_TOKEN"
        const val REFRESH_TOKEN = "REFRESH_TOKEN"
        const val EXPIRED_AT = "EXPIRED_AT"
    }
}