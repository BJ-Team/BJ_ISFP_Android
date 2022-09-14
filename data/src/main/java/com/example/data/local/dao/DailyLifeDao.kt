package com.example.data.local.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.roomentity.dailylife.FetchDailyLifePostRoomEntity

interface DailyLifeDao {
    @Query("SELECT * FROM dailyLife")
    suspend fun fetchDailyLifeList(): FetchDailyLifePostRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveDailyLifeList(dailyLifePostRoomEntity: FetchDailyLifePostRoomEntity)
}