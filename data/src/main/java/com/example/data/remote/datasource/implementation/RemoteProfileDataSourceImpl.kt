package com.example.data.remote.datasource.implementation

import com.example.data.remote.api.ProfileApi
import com.example.data.remote.datasource.declaration.RemoteProfileDataSource
import com.example.data.remote.response.profile.FetchOtherBuyListResponse
import com.example.data.remote.response.profile.FetchOtherProfileResponse
import com.example.data.remote.response.profile.FetchOtherSellListResponse
import com.example.data.remote.response.profile.FetchOtherWishListResponse
import com.example.data.util.HttpHandler
import javax.inject.Inject

class RemoteProfileDataSourceImpl @Inject constructor(
    private val profileApi: ProfileApi
): RemoteProfileDataSource {
    override suspend fun fetchProfile(
        userId: Long
    )= HttpHandler<FetchOtherProfileResponse>()
        .httpRequest { profileApi.fetchProfile(userId) }
        .sendRequest()

    override suspend fun fetchWishPost(
        userId: Long
    )= HttpHandler<FetchOtherWishListResponse>()
        .httpRequest { profileApi.fetchWishPost(userId) }
        .sendRequest()

    override suspend fun fetchSellList(
        userId: Long
    )= HttpHandler<FetchOtherSellListResponse>()
        .httpRequest { profileApi.fetchSellList(userId) }
        .sendRequest()

    override suspend fun fetchBuyList(
        userId: Long
    )= HttpHandler<FetchOtherBuyListResponse>()
        .httpRequest { profileApi.fetchBuyList(userId) }
        .sendRequest()
}