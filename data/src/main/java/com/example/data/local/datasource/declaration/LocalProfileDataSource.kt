package com.example.data.local.datasource.declaration

import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity
import com.example.domain.entity.profile.FetchOtherWishListEntity

interface LocalProfileDataSource {

    suspend fun fetchProfile(): FetchOtherProfileEntity

    suspend fun saveProfile(list: FetchOtherProfileEntity)

    suspend fun fetchWishList(): FetchOtherWishListEntity

    suspend fun saveWishList(list: FetchOtherWishListEntity)

    suspend fun fetchBuyList(): FetchOtherBuyListEntity

    suspend fun saveBuyList(list: FetchOtherBuyListEntity)

    suspend fun fetchSellList(): FetchOtherSellListEntity

    suspend fun saveBUyList(list: FetchOtherSellListEntity)
}