package com.example.data.local.roomentity.profile

import com.example.domain.entity.profile.FetchOtherBuyListEntity

data class FetchOtherBuyListRoomEntity(
    val buy_product_list: List<MyBuyProductList>
) {
    data class MyBuyProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String
    )

    fun MyBuyProductList.toEntity() =
        FetchOtherBuyListEntity.MyBuyProductList(
            postId = postId,
            title = title,
            location = location,
            postImage = postImage
        )
}

fun FetchOtherBuyListRoomEntity.toEntity() =
    FetchOtherBuyListEntity(
        buy_product_list = buy_product_list.map { it.toEntity() }
    )

fun FetchOtherBuyListEntity.toDbEntity() =
    FetchOtherBuyListRoomEntity(
        buy_product_list = buy_product_list.map { it.toDbEntity() }
    )

fun FetchOtherBuyListEntity.MyBuyProductList.toDbEntity() =
    FetchOtherBuyListRoomEntity.MyBuyProductList(
        postId = postId,
        title = title,
        location = location,
        postImage = postImage
    )