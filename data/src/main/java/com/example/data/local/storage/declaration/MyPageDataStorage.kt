package com.example.data.local.storage.declaration

import com.example.data.local.param.FetchMyPageParam

interface MyPageDataStorage {

    fun setMyPage(fetchMyPageParam: FetchMyPageParam)

    fun fetchName(): String
    fun fetchLocation(): String
    fun fetchProfile(): String
}