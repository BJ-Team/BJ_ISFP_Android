package com.example.data.local.roomentity.mypage

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.mypage.FetchMyWishListEntity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "wish")
data class FetchMyWishListRoomEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
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
        FetchMyWishListEntity.SellProductList(
            postId = postId,
            title = title,
            location = location,
            price = price,
            postImage = postImage
        )
}

fun FetchMyWishListRoomEntity.toEntity() =
    FetchMyWishListEntity(
        sellProductList = sellProductList.map { it.toEntity() }
    )

fun FetchMyWishListEntity.toDbEntity() =
    FetchMyWishListRoomEntity(
        sellProductList = sellProductList.map { it.toDbEntity() }
    )

fun FetchMyWishListEntity.SellProductList.toDbEntity() =
    FetchMyWishListRoomEntity.SellProductList(
        postId = postId,
        title = title,
        location = location,
        price = price,
        postImage = postImage
    )