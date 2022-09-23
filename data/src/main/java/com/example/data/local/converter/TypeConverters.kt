package com.example.data.local.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.data.local.roomentity.dailylife.FetchDailyLifePostRoomEntity
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

@ProvidedTypeConverter
class DailyLifeListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchDailyLifePostRoomEntity.LifeList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchDailyLifePostRoomEntity.LifeList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchDailyLifePostRoomEntity.LifeList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchDailyLifePostRoomEntity.LifeList::class.java
        )
        val adapter: JsonAdapter<List<FetchDailyLifePostRoomEntity.LifeList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}