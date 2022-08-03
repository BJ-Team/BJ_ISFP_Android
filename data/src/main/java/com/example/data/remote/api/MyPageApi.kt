package com.example.data.remote.api

import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.GET

interface MyPageApi {

    @GET(IsFpApiUrl.MyPage.myPage)
    suspend fun fetchMyPage()

    @GET(IsFpApiUrl.MyPage.wishPost)
    suspend fun fetchWishPost()

    @GET(IsFpApiUrl.MyPage.sellList)
    suspend fun fetchSellList()

    @GET(IsFpApiUrl.MyPage.buyList)
    suspend fun fetchBuyList()
}