package com.example.data.local.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.roomentity.mypage.FetchMyPageRoomEntity
import com.example.data.local.roomentity.mypage.FetchMyWishListRoomEntity

interface MyPageDao {

    @Query("SELECT * FROM myPage")
    suspend fun fetchMyPage(): FetchMyPageRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMyPage(fetchMyPageRoomEntity: FetchMyPageRoomEntity)

    @Query("SELECT * FROM wish")
    suspend fun fetchMyWishList(): FetchMyWishListRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMyWishList(fetchMyWishListRoomEntity: FetchMyWishListRoomEntity)
}