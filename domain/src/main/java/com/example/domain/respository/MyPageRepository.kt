package com.example.domain.respository

import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.mypage.FetchMyWishListEntity

interface MyPageRepository {

    suspend fun fetchMyPage(): FetchMyPageEntity

    suspend fun fetchMyWishList(): FetchMyWishListEntity

    suspend fun fetchMySellList(): FetchMySellListEntity

    suspend fun fetchMyBuyList(): FetchMyBuyListEntity
}