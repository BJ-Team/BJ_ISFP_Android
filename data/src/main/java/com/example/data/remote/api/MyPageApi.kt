package com.example.data.remote.api

import com.example.data.remote.response.mypage.FetchMyBuyListResponse
import com.example.data.remote.response.mypage.FetchMyPageResponse
import com.example.data.remote.response.mypage.FetchMySellListResponse
import com.example.data.remote.response.mypage.FetchMyWishListResponse
import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.GET
import retrofit2.http.Header

interface MyPageApi {

    @GET(IsFpApiUrl.MyPage.myPage)
    suspend fun fetchMyPage(): FetchMyPageResponse

    @GET(IsFpApiUrl.MyPage.wishPost)
    suspend fun fetchWishPost(): FetchMyWishListResponse

    @GET(IsFpApiUrl.MyPage.sellList)
    suspend fun fetchSellList(): FetchMySellListResponse

    @GET(IsFpApiUrl.MyPage.buyList)
    suspend fun fetchBuyList(): FetchMyBuyListResponse
}