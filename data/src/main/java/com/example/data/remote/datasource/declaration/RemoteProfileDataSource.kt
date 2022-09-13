package com.example.data.remote.datasource.declaration

import com.example.data.remote.response.profile.FetchOtherBuyListResponse
import com.example.data.remote.response.profile.FetchOtherProfileResponse
import com.example.data.remote.response.profile.FetchOtherSellListResponse
import com.example.data.remote.response.profile.FetchOtherWishListResponse

interface RemoteProfileDataSource {

    suspend fun fetchProfile(userId: Long): FetchOtherProfileResponse

    suspend fun fetchWishPost(userId: Long): FetchOtherWishListResponse

    suspend fun fetchSellList(userId: Long): FetchOtherSellListResponse

    suspend fun fetchBuyList(userId: Long): FetchOtherBuyListResponse
}