package com.example.domain.respository

import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity
import kotlinx.coroutines.flow.Flow

interface MyPageRepository {

    suspend fun fetchMyPage(): Flow<FetchMyPageEntity>

    suspend fun fetchMyWishList(): Flow<FetchMyWishListEntity>

    suspend fun fetchMySellList(): Flow<FetchMySellListEntity>

    suspend fun fetchMyBuyList(): Flow<FetchMyBuyListEntity>
}