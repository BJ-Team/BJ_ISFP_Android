package com.example.data.local.datasource.declaration

import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity

interface LocalProfileDataSource {

    suspend fun fetchProfile(): FetchOtherProfileEntity

    suspend fun saveProfile(list: FetchOtherProfileEntity)

    suspend fun fetchWishList(): FetchOtherProfileEntity

    suspend fun saveWishList(list: FetchOtherProfileEntity)

    suspend fun fetchBuyList(): FetchOtherBuyListEntity

    suspend fun saveBuyList(list: FetchOtherBuyListEntity)

    suspend fun fetchSellList(): FetchOtherSellListEntity

    suspend fun saveBUyList(list: FetchOtherSellListEntity)
}