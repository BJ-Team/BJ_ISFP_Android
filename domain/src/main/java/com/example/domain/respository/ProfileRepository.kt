package com.example.domain.respository

import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity
import com.example.domain.entity.profile.FetchOtherWishListEntity

interface ProfileRepository {

    suspend fun fetchProfile(userId: Long): FetchOtherProfileEntity

    suspend fun fetchWishPost(userId: Long): FetchOtherWishListEntity

    suspend fun fetchSellPost(userId: Long): FetchOtherSellListEntity

    suspend fun fetchBuyPost(userId: Long): FetchOtherBuyListEntity
}