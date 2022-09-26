package com.example.data.local.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.data.local.roomentity.dailylife.FetchDailyLifePostRoomEntity
import com.example.data.local.roomentity.mypage.FetchMyBuyListRoomEntity
import com.example.data.local.roomentity.mypage.FetchMySellListRoomEntity
import com.example.data.local.roomentity.mypage.FetchMyWishListRoomEntity
import com.example.data.local.roomentity.post.FetchPostListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherBuyListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherSellListRoomEntity
import com.example.data.local.roomentity.profile.FetchOtherWishListRoomEntity
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

@ProvidedTypeConverter
class MyBuyListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchMyBuyListRoomEntity.MyBuyProductList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchMyBuyListRoomEntity.MyBuyProductList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchMyBuyListRoomEntity.MyBuyProductList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchMyBuyListRoomEntity.MyBuyProductList::class.java
        )
        val adapter: JsonAdapter<List<FetchMyBuyListRoomEntity.MyBuyProductList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}

@ProvidedTypeConverter
class MySellListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchMySellListRoomEntity.MySellProductList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchMySellListRoomEntity.MySellProductList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchMySellListRoomEntity.MySellProductList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchMySellListRoomEntity.MySellProductList::class.java
        )
        val adapter: JsonAdapter<List<FetchMySellListRoomEntity.MySellProductList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}

@ProvidedTypeConverter
class MyWishListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchMyWishListRoomEntity.SellProductList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchMyWishListRoomEntity.SellProductList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchMyWishListRoomEntity.SellProductList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchMyWishListRoomEntity.SellProductList::class.java
        )
        val adapter: JsonAdapter<List<FetchMyWishListRoomEntity.SellProductList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}

@ProvidedTypeConverter
class PostTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchPostListRoomEntity.PostList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchPostListRoomEntity.PostList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchPostListRoomEntity.PostList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchPostListRoomEntity.PostList::class.java
        )
        val adapter: JsonAdapter<List<FetchPostListRoomEntity.PostList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}

@ProvidedTypeConverter
class OtherBuyListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchOtherBuyListRoomEntity.MyBuyProductList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchOtherBuyListRoomEntity.MyBuyProductList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchOtherBuyListRoomEntity.MyBuyProductList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchOtherBuyListRoomEntity.MyBuyProductList::class.java
        )
        val adapter: JsonAdapter<List<FetchOtherBuyListRoomEntity.MyBuyProductList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}

@ProvidedTypeConverter
class OtherSellListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchOtherSellListRoomEntity.MySellProductList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchOtherSellListRoomEntity.MySellProductList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchOtherSellListRoomEntity.MySellProductList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchOtherSellListRoomEntity.MySellProductList::class.java
        )
        val adapter: JsonAdapter<List<FetchOtherSellListRoomEntity.MySellProductList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}

@ProvidedTypeConverter
class OtherWishListTypeConverter(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<FetchOtherWishListRoomEntity.SellProductList>? {
        val listType = Types.newParameterizedType(
            List::class.java
        )
        val adapter: JsonAdapter<List<FetchOtherWishListRoomEntity.SellProductList>> =
            moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromList(type: List<FetchOtherWishListRoomEntity.SellProductList>): String{
        val listType = Types.newParameterizedType(
            List::class.java,
            FetchOtherWishListRoomEntity.SellProductList::class.java
        )
        val adapter: JsonAdapter<List<FetchOtherWishListRoomEntity.SellProductList>> =
            moshi.adapter(listType)
        return adapter.toJson(type)
    }
}