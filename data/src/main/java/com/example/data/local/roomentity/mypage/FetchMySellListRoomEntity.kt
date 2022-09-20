package com.example.data.local.roomentity.mypage

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.mypage.FetchMySellListEntity

@Entity(tableName = "sell")
data class FetchMySellListRoomEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
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
        FetchMySellListEntity.MySellProductList(
            postId = postId,
            title = title,
            location = location,
            postImage = postImage,
            price = price
        )
}

fun FetchMySellListRoomEntity.toEntity() =
    FetchMySellListEntity(
        sell_product_list = sell_product_list.map { it.toEntity() }
    )

fun FetchMySellListEntity.toDbEntity() =
    FetchMySellListRoomEntity(
        sell_product_list = sell_product_list.map { it.toDbEntity() }
    )

fun FetchMySellListEntity.MySellProductList.toDbEntity() =
    FetchMySellListRoomEntity.MySellProductList(
        postId = postId,
        title = title,
        location = location,
        postImage = postImage,
        price = price
    )
