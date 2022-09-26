package com.example.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.data.local.converter.DailyLifeListTypeConverter
import com.example.data.local.dao.DailyLifeDao
import com.example.data.local.dao.MyPageDao
import com.example.data.local.dao.PostDao
import com.example.data.local.dao.ProfileDao
import com.example.data.local.roomentity.dailylife.FetchDailyLifePostRoomEntity
import com.example.data.local.roomentity.mypage.FetchMyBuyListRoomEntity
import com.example.data.local.roomentity.mypage.FetchMySellListRoomEntity
import com.example.data.local.roomentity.mypage.FetchMyWishListRoomEntity
import com.example.data.local.roomentity.post.FetchPostListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherBuyListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherSellListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherWishListRoomEntity

@Database(
    entities = [
        FetchDailyLifePostRoomEntity::class,
        FetchMyBuyListRoomEntity::class,
        FetchMySellListRoomEntity::class,
        FetchMyWishListRoomEntity::class,
        FetchPostListRoomEntity::class,
        FetchOtherBuyListRoomEntity::class,
        FetchOtherSellListRoomEntity::class,
        FetchOtherWishListRoomEntity::class
    ], version = 1, exportSchema = false
)

@TypeConverters(
    value = [
        DailyLifeListTypeConverter::class
    ]
)

abstract class ISFPDataBase : RoomDatabase() {
    abstract fun dailyLifeDao(): DailyLifeDao
    abstract fun myPageDao(): MyPageDao
    abstract fun postDao(): PostDao
    abstract fun profileDao(): ProfileDao
}