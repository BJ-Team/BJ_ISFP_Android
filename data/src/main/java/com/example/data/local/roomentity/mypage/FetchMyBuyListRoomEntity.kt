package com.example.data.local.roomentity.mypage

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.mypage.FetchMyBuyListEntity

@Entity(tableName = "buy")
data class FetchMyBuyListRoomEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val buy_product_list: List<MyBuyProductList>
) {
    data class MyBuyProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String
    )

    fun MyBuyProductList.toEntity() =
        FetchMyBuyListEntity.MyBuyProductList(
            postId = postId,
            title = title,
            location = location,
            postImage = postImage
        )
}

fun FetchMyBuyListRoomEntity.toEntity() =
    FetchMyBuyListEntity(
        buy_product_list = buy_product_list.map { it.toEntity() }
    )

fun FetchMyBuyListEntity.toDbEntity() =
    FetchMyBuyListRoomEntity(
        buy_product_list = buy_product_list.map { it.toDbEntity() }
    )

fun FetchMyBuyListEntity.MyBuyProductList.toDbEntity() =
    FetchMyBuyListRoomEntity.MyBuyProductList(
        postId = postId,
        title = title,
        location = location,
        postImage = postImage
    )