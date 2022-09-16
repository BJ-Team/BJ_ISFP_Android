package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.remote.datasource.declaration.RemoteMyPageDataSource
import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity
import com.example.domain.respository.MyPageRepository
import javax.inject.Inject

class MyPageRepositoryImpl @Inject constructor(
    val remoteMyPageDataSource: RemoteMyPageDataSource,
    val localMyPageDataSource: LocalMyPageDataSource
): MyPageRepository {
    override suspend fun fetchMyPage(): FetchMyPageEntity {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMyWishList(): FetchMyWishListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMySellList(): FetchMySellListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMyBuyList(): FetchMyBuyListEntity {
        TODO("Not yet implemented")
    }
}