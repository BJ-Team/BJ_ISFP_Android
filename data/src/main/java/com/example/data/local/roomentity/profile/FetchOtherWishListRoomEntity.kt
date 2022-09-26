package com.example.data.local.roomentity.profile

import com.example.domain.entity.profile.FetchOtherWishListEntity

data class FetchOtherWishListRoomEntity(
    val sellProductList: List<SellProductList>
) {
    data class SellProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val price: Int,
        val postImage: String
    )

    fun SellProductList.toEntity() =
        FetchOtherWishListEntity.SellProductList(
            postId = postId,
            title = title,
            location = location,
            price = price,
            postImage = postImage
        )
}

fun FetchOtherWishListRoomEntity.toEntity() =
    FetchOtherWishListEntity(
        sellProductList = sellProductList.map { it.toEntity() }
    )

fun FetchOtherWishListEntity.toDbEntity() =
    FetchOtherWishListRoomEntity(
        sellProductList = sellProductList.map { it.toDbEntity() }
    )

fun FetchOtherWishListEntity.SellProductList.toDbEntity() =
    FetchOtherWishListRoomEntity.SellProductList(
        postId = postId,
        title = title,
        location = location,
        price = price,
        postImage = postImage
    )