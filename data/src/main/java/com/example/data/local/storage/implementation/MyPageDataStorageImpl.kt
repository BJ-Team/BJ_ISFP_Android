package com.example.data.local.storage.implementation

import android.content.Context
import androidx.preference.PreferenceManager
import com.example.data.local.param.FetchMyPageParam
import com.example.data.local.storage.declaration.MyPageDataStorage
import com.example.data.local.storage.implementation.MyPageDataStorageImpl.MyPageInformation.name
import com.example.data.local.storage.implementation.MyPageDataStorageImpl.MyPageInformation.nowMyLocation
import com.example.data.local.storage.implementation.MyPageDataStorageImpl.MyPageInformation.userProfile
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MyPageDataStorageImpl @Inject constructor(
    @ApplicationContext private val context: Context
): MyPageDataStorage {
    override fun setMyPage(fetchMyPageParam: FetchMyPageParam) {
        getSharedPreference().edit().let {
            it.putString(name, fetchMyPageParam.name)
            it.putString(nowMyLocation, fetchMyPageParam.nowMyLocation)
            it.putString(userProfile, fetchMyPageParam.userProfile)
            it.apply()
        }
    }

    override fun fetchName(): String =
        getSharedPreference().getString(name, "empty")!!

    override fun fetchLocation(): String =
        getSharedPreference().getString(nowMyLocation, "empty")!!

    override fun fetchProfile(): String =
        getSharedPreference().getString(userProfile, "empty")!!

    private fun getSharedPreference() =
        PreferenceManager.getDefaultSharedPreferences(context)

    private object MyPageInformation {
        const val name = "NAME"
        const val nowMyLocation = "LOCATION"
        const val userProfile = "PROFILE"
    }
}