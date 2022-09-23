package com.example.data.local.datasource.implementation

import com.example.data.local.dao.MyPageDao
import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.local.param.FetchMyPageParam
import com.example.data.local.roomentity.mypage.toDbEntity
import com.example.data.local.roomentity.mypage.toEntity
import com.example.data.local.storage.declaration.MyPageDataStorage
import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity
import javax.inject.Inject

class LocalMyPageDataSourceImpl @Inject constructor(
    private val myPageDao: MyPageDao,
    private val myPageDataStorage: MyPageDataStorage
): LocalMyPageDataSource {

    override suspend fun fetchMyPage(): FetchMyPageEntity {
        myPageDataStorage.apply {
            return FetchMyPageEntity(
                fetchName(),
                fetchLocation(),
                fetchProfile(),
            )
        }
    }

    override suspend fun saveMyPage(list: FetchMyPageEntity) {
        list.apply {
            myPageDataStorage.setMyPage(
                FetchMyPageParam(
                    name,
                    nowMyLocation,
                    userProfile
                )
            )
        }
    }

    override suspend fun fetchMyWishList(): FetchMyWishListEntity =
        myPageDao.fetchMyWishList().toEntity()

    override suspend fun saveMyWishList(list: FetchMyWishListEntity) =
        myPageDao.saveMyWishList(list.toDbEntity())

    override suspend fun fetchMyBuyList(): FetchMyBuyListEntity =
        myPageDao.fetchMyBuyList().toEntity()

    override suspend fun saveMyBuyList(list: FetchMyBuyListEntity) =
        myPageDao.saveMyBuyList(list.toDbEntity())

    override suspend fun fetchMySellList(): FetchMySellListEntity =
        myPageDao.fetchMySellList().toEntity()

    override suspend fun saveMySellList(list: FetchMySellListEntity) =
        myPageDao.saveMySellList(list.toDbEntity())
}