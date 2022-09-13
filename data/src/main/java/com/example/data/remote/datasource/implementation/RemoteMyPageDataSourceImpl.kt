package com.example.data.remote.datasource.implementation

import com.example.data.remote.api.MyPageApi
import com.example.data.remote.datasource.declaration.RemoteMyPageDataSource
import com.example.data.remote.response.mypage.FetchMyBuyListResponse
import com.example.data.remote.response.mypage.FetchMyPageResponse
import com.example.data.remote.response.mypage.FetchMySellListResponse
import com.example.data.remote.response.mypage.FetchMyWishListResponse
import com.example.data.util.HttpHandler
import javax.inject.Inject

class RemoteMyPageDataSourceImpl @Inject constructor(
    private val myPageApi: MyPageApi
): RemoteMyPageDataSource {
    override suspend fun fetchMyPage()= HttpHandler<FetchMyPageResponse>()
        .httpRequest { myPageApi.fetchMyPage() }
        .sendRequest()

    override suspend fun fetchWishPost()= HttpHandler<FetchMyWishListResponse>()
        .httpRequest { myPageApi.fetchWishPost() }
        .sendRequest()

    override suspend fun fetchSellList()= HttpHandler<FetchMySellListResponse>()
        .httpRequest { myPageApi.fetchSellList() }
        .sendRequest()

    override suspend fun fetchBuyList()= HttpHandler<FetchMyBuyListResponse>()
        .httpRequest { myPageApi.fetchBuyList() }
        .sendRequest()

}