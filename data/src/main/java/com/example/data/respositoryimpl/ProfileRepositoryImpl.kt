package com.example.data.respositoryimpl

import com.example.data.remote.datasource.declaration.RemoteProfileDataSource
import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity
import com.example.domain.entity.profile.FetchOtherWishListEntity
import com.example.domain.respository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    val remoteProfileDataSource: RemoteProfileDataSource,
    val localProfileDataSource: RemoteProfileDataSource
): ProfileRepository {
    override suspend fun fetchProfile(userId: Long): FetchOtherProfileEntity {
        TODO("Not yet implemented")
    }

    override suspend fun fetchWishPost(userId: Long): FetchOtherWishListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun fetchSellPost(userId: Long): FetchOtherSellListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun fetchBuyPost(userId: Long): FetchOtherBuyListEntity {
        TODO("Not yet implemented")
    }
}