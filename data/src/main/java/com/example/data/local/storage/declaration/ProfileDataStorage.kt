package com.example.data.local.storage.declaration

import com.example.data.local.param.FetchMyPageParam
import com.example.data.local.param.FetchProfileParam

interface ProfileDataStorage {

    fun setProfile(fetchProfileParam: FetchProfileParam)

    fun fetchUserId(): Int
    fun fetchUserName(): String
    fun fetchUserProfile(): String
}