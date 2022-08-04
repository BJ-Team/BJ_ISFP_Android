package com.example.data.remote.api

import com.example.data.remote.response.profile.FetchOtherBuyListResponse
import com.example.data.remote.response.profile.FetchOtherProfileResponse
import com.example.data.remote.response.profile.FetchOtherSellListResponse
import com.example.data.remote.response.profile.FetchOtherWishListResponse
import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.GET
import retrofit2.http.Query

interface ProfileApi {

    @GET(IsFpApiUrl.Profile.myPage)
    suspend fun fetchProfile(
        @Query("user_id") userId: Long
    ): FetchOtherProfileResponse

    @GET(IsFpApiUrl.Profile.wishPost)
    suspend fun fetchWishPost(
        @Query("user_id") userId: Long
    ): FetchOtherWishListResponse

    @GET(IsFpApiUrl.Profile.sellList)
    suspend fun fetchSellList(
        @Query("user_id") userId: Long
    ): FetchOtherSellListResponse

    @GET(IsFpApiUrl.Profile.buyList)
    suspend fun fetchBuyList(
        @Query("user_id") userId: Long
    ): FetchOtherBuyListResponse
}