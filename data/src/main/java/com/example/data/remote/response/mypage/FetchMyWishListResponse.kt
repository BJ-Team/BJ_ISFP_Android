package com.example.data.remote.response.mypage

import com.example.domain.entity.mypage.FetchMyWishListEntity
import com.google.gson.annotations.SerializedName

data class FetchMyWishListResponse(
    @SerializedName("sell_product_list") val sellProductList: List<SellProductList>
) {
    data class SellProductList(
        @SerializedName("post_id") val postId: Long,
        @SerializedName("title") val title: String,
        @SerializedName("location") val location: String,
        @SerializedName("price") val price: Int,
        @SerializedName("post_image") val postImage: String
    )
}

fun FetchMyWishListResponse.SellProductList.toEntity() =
    FetchMyWishListEntity.SellProductList(
        postId = postId,
        title = title,
        location = location,
        price = price,
        postImage = postImage
    )

fun FetchMyWishListResponse.toEntity() =
    FetchMyWishListEntity(
        sellProductList = sellProductList.map { it.toEntity() }
    )