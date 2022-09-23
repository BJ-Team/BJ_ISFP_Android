package com.example.data.local.storage.implementation

import android.content.Context
import androidx.preference.PreferenceManager
import com.example.data.local.param.FetchProfileParam
import com.example.data.local.storage.declaration.ProfileDataStorage
import com.example.data.local.storage.implementation.ProfileDataStorageImpl.ProfileInformation.userId
import com.example.data.local.storage.implementation.ProfileDataStorageImpl.ProfileInformation.userName
import com.example.data.local.storage.implementation.ProfileDataStorageImpl.ProfileInformation.userProfile
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ProfileDataStorageImpl @Inject constructor(
    @ApplicationContext private val context: Context
): ProfileDataStorage {
    override fun setProfile(fetchProfileParam: FetchProfileParam) {
        getSharedPreference().edit().let {
            it.putInt(userId.toString(), fetchProfileParam.userId)
            it.putString(userName, fetchProfileParam.name)
            it.putString(userProfile, fetchProfileParam.userProfile)
            it.apply()
        }
    }

    override fun fetchUserId(): Int =
        getSharedPreference().getInt(userId.toString(), 0)

    override fun fetchUserName(): String =
        getSharedPreference().getString(userName, "empty")!!

    override fun fetchUserProfile(): String =
        getSharedPreference().getString(userProfile, "empty")!!

    private fun getSharedPreference() =
        PreferenceManager.getDefaultSharedPreferences(context)

    private object ProfileInformation {
        const val userId = 1
        const val userName = "USERNAME"
        const val userProfile = "USERPROFILE"
    }
}