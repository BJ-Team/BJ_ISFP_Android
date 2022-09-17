package com.example.data.remote.response.mypage

import com.example.domain.entity.mypage.FetchMyBuyListEntity
import com.google.gson.annotations.SerializedName

data class FetchMyBuyListResponse(
    @SerializedName("buy_product_list") val buy_product_list: List<MyBuyProductList>
) {
    data class MyBuyProductList(
        @SerializedName("post_id") val postId: Long,
        @SerializedName("title") val title: String,
        @SerializedName("location") val location: String,
        @SerializedName("post_image") val postImage: String
    )
}

fun FetchMyBuyListResponse.MyBuyProductList.toEntity() =
    FetchMyBuyListEntity.MyBuyProductList(
        postId = postId,
        title = title,
        location = location,
        postImage = postImage
    )

fun FetchMyBuyListResponse.toEntity() =
    FetchMyBuyListEntity(
        buy_product_list = buy_product_list.map { it.toEntity() }
    )