package com.example.data.remote.datasource.declaration

import com.example.data.remote.response.mypage.FetchMyBuyListResponse
import com.example.data.remote.response.mypage.FetchMyPageResponse
import com.example.data.remote.response.mypage.FetchMySellListResponse
import com.example.data.remote.response.mypage.FetchMyWishListResponse

interface RemoteMyPageDataSource {

    suspend fun fetchMyPage(): FetchMyPageResponse

    suspend fun fetchWishPost(): FetchMyWishListResponse

    suspend fun fetchSellList(): FetchMySellListResponse

    suspend fun fetchBuyList(): FetchMyBuyListResponse
}