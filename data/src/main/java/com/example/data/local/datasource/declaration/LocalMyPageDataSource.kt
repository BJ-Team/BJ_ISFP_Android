package com.example.data.local.datasource.declaration

import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity

interface LocalMyPageDataSource {

    suspend fun fetchMyPage(): FetchMyPageEntity

    suspend fun saveMyPage(list: FetchMyPageEntity)

    suspend fun fetchMyWishList(): FetchMyWishListEntity

    suspend fun saveMyWishList(list: FetchMyWishListEntity)

    suspend fun fetchMyBuyList(): FetchMyBuyListEntity

    suspend fun saveMyBuyList(list: FetchMyBuyListEntity)

    suspend fun fetchMySellList(): FetchMySellListEntity

    suspend fun saveMySellList(list: FetchMySellListEntity)
}