package com.example.data.remote.response.mypage

import com.example.domain.entity.mypage.FetchMySellListEntity
import com.google.gson.annotations.SerializedName

data class FetchMySellListResponse(
    @SerializedName("sell_product_list") val sell_product_list: List<MySellProductList>
) {
    data class MySellProductList(
        @SerializedName("post_id") val postId: Long,
        @SerializedName("title") val title: String,
        @SerializedName("location") val location: String,
        @SerializedName("post_image") val postImage: String,
        @SerializedName("price") val price: Int
    )
}

fun FetchMySellListResponse.MySellProductList.toEntity() =
    FetchMySellListEntity.MySellProductList(
        postId = postId,
        title = title,
        location = location,
        postImage = postImage,
        price = price
    )

fun FetchMySellListResponse.toEntity() =
    FetchMySellListEntity(
        sell_product_list = sell_product_list.map { it.toEntity() }
    )