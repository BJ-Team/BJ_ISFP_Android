package com.example.data.local.datasource.implementation

import com.example.data.local.dao.ProfileDao
import com.example.data.local.datasource.declaration.LocalProfileDataSource
import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity
import javax.inject.Inject

class LocalProfileDataSourceImpl @Inject constructor(
    val profileDao: ProfileDao,
    val profileStorage: ProfileStorage
): LocalProfileDataSource {
    override suspend fun fetchProfile(): FetchOtherProfileEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveProfile(list: FetchOtherProfileEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchWishList(): FetchOtherProfileEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveWishList(list: FetchOtherProfileEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchBuyList(): FetchOtherBuyListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveBuyList(list: FetchOtherBuyListEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchSellList(): FetchOtherSellListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveBUyList(list: FetchOtherSellListEntity) {
        TODO("Not yet implemented")
    }
}