package com.example.data.local.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.roomentity.profile.FetchOtherBuyListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherSellListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherWishListRoomEntity

interface ProfileDao {

    @Query("SELECT * FROM wish")
    suspend fun fetchOtherWishList(): FetchOtherWishListRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveOtherWishList(fetchOtherWishListRoomEntity: FetchOtherWishListRoomEntity)

    @Query("SELECT * FROM buy")
    suspend fun fetchOtherBuyList(): FetchOtherBuyListRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveOtherBuyList(fetchOtherBuyListRoomEntity: FetchOtherBuyListRoomEntity)

    @Query("SELECT * FROM sell")
    suspend fun fetchOtherSellList(): FetchOtherSellListRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveOtherSellList(fetchOtherSellListRoomEntity: FetchOtherSellListRoomEntity)
}