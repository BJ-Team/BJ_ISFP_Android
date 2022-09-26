package com.example.data.local.datasource.implementation

import com.example.data.local.dao.ProfileDao
import com.example.data.local.datasource.declaration.LocalProfileDataSource
import com.example.data.local.param.FetchProfileParam
import com.example.data.local.roomentity.profile.toDbEntity
import com.example.data.local.roomentity.profile.toEntity
import com.example.data.local.storage.declaration.ProfileDataStorage
import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity
import com.example.domain.entity.profile.FetchOtherWishListEntity
import javax.inject.Inject

class LocalProfileDataSourceImpl @Inject constructor(
    private val profileDao: ProfileDao,
    private val profileDataStorage: ProfileDataStorage
): LocalProfileDataSource {
    override suspend fun fetchProfile(): FetchOtherProfileEntity {
        profileDataStorage.apply {
            return FetchOtherProfileEntity(
                fetchUserId(),
                fetchUserName(),
                fetchUserProfile()
            )
        }
    }

    override suspend fun saveProfile(list: FetchOtherProfileEntity) {
        list.apply {
            profileDataStorage.setProfile(
                FetchProfileParam(
                    userId,
                    name,
                    userProfile
                )
            )
        }
    }

    override suspend fun fetchWishList(): FetchOtherWishListEntity =
        profileDao.fetchOtherWishList().toEntity()

    override suspend fun saveWishList(list: FetchOtherWishListEntity) =
        profileDao.saveOtherWishList(list.toDbEntity())

    override suspend fun fetchBuyList(): FetchOtherBuyListEntity =
        profileDao.fetchOtherBuyList().toEntity()

    override suspend fun saveBuyList(list: FetchOtherBuyListEntity) =
        profileDao.saveOtherBuyList(list.toDbEntity())

    override suspend fun fetchSellList(): FetchOtherSellListEntity =
        profileDao.fetchOtherSellList().toEntity()

    override suspend fun saveBUyList(list: FetchOtherSellListEntity) =
        profileDao.saveOtherSellList(list.toDbEntity())
}