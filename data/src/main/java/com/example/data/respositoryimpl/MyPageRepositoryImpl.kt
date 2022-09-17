package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.remote.datasource.declaration.RemoteMyPageDataSource
import com.example.data.remote.response.mypage.toEntity
import com.example.data.util.OfflineCacheUtil
import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity
import com.example.domain.respository.MyPageRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MyPageRepositoryImpl @Inject constructor(
    private val remoteMyPageDataSource: RemoteMyPageDataSource,
    private val localMyPageDataSource: LocalMyPageDataSource
): MyPageRepository {

    override suspend fun fetchMyPage(): Flow<FetchMyPageEntity> =
        OfflineCacheUtil<FetchMyPageEntity>()
            .remoteData { remoteMyPageDataSource.fetchMyPage().toEntity() }
            .localData { localMyPageDataSource.fetchMyPage() }
            .doOnNeedRefresh { localMyPageDataSource.saveMyPage(it) }
            .createFlow()

    override suspend fun fetchMyWishList(): Flow<FetchMyWishListEntity> =
        OfflineCacheUtil<FetchMyWishListEntity>()
            .remoteData { remoteMyPageDataSource.fetchWishPost().toEntity() }
            .localData { localMyPageDataSource.fetchMyWishList() }
            .doOnNeedRefresh { localMyPageDataSource.saveMyWishList(it) }
            .createFlow()

    override suspend fun fetchMySellList(): Flow<FetchMySellListEntity> =
        OfflineCacheUtil<FetchMySellListEntity>()
            .remoteData { remoteMyPageDataSource.fetchSellList().toEntity() }
            .localData { localMyPageDataSource.fetchMySellList() }
            .doOnNeedRefresh { localMyPageDataSource.saveMySellList(it) }
            .createFlow()

    override suspend fun fetchMyBuyList(): Flow<FetchMyBuyListEntity> =
        OfflineCacheUtil<FetchMyBuyListEntity>()
            .remoteData { remoteMyPageDataSource.fetchBuyList().toEntity() }
            .localData { localMyPageDataSource.fetchMyBuyList() }
            .doOnNeedRefresh { localMyPageDataSource.saveMyBuyList(it) }
            .createFlow()
}