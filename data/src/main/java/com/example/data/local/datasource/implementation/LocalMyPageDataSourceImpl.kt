package com.example.data.local.datasource.implementation

import com.example.data.local.dao.MyPageDao
import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.local.storage.declaration.MyPageStorage
import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity
import javax.inject.Inject

class LocalMyPageDataSourceImpl @Inject constructor(
    val myPageDao: MyPageDao,
    val myPageStorage: MyPageStorage
): LocalMyPageDataSource {

    override suspend fun fetchMyPage(): FetchMyPageEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveMyPage(fetchMyPageEntity: FetchMyPageEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMyWishList(): FetchMyWishListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveMyWishList(list: FetchMyWishListEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMyBuyList(): FetchMyBuyListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveMyBuyList(list: FetchMyBuyListEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMySellList(): FetchMySellListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun saveMySellList(list: FetchMySellListEntity) {
        TODO("Not yet implemented")
    }
}