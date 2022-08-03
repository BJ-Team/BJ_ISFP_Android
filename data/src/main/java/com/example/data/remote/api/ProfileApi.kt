package com.example.data.remote.api

import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.GET

interface ProfileApi {

    @GET(IsFpApiUrl.Profile.myPage)
    suspend fun fetchProfile()

    @GET(IsFpApiUrl.Profile.wishPost)
    suspend fun fetchWishPost()

    @GET(IsFpApiUrl.Profile.sellList)
    suspend fun fetchSellList()

    @GET(IsFpApiUrl.Profile.buyList)
    suspend fun fetchBuyList()
}