package com.example.data.local.roomentity.profile

import com.example.domain.entity.profile.FetchOtherSellListEntity
import com.google.gson.annotations.SerializedName

data class FetchOtherSellListRoomEntity(
    val sell_product_list: List<MySellProductList>
) {
    data class MySellProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String,
        val price: Int
    )

    fun MySellProductList.toEntity() =
        FetchOtherSellListEntity.MySellProductList(
            postId = postId,
            title = title,
            location = location,
            postImage = postImage,
            price = price
        )
}

fun FetchOtherSellListRoomEntity.toEntity() =
    FetchOtherSellListEntity(
        sell_product_list = sell_product_list.map { it.toEntity() }
    )

fun FetchOtherSellListEntity.toDbEntity() =
    FetchOtherSellListRoomEntity(
        sell_product_list = sell_product_list.map { it.toDbEntity() }
    )

fun FetchOtherSellListEntity.MySellProductList.toDbEntity() =
    FetchOtherSellListRoomEntity.MySellProductList(
        postId = postId,
        title = title,
        location = location,
        postImage = postImage,
        price = price
    )