package com.example.domain.entity.mypage

import com.google.gson.annotations.SerializedName

data class FetchMyWishListEntity(
    @SerializedName("sell_product_list") val sellProductList: SellProductList
) {
    data class SellProductList(
        @SerializedName("post_id") val postId: Long,
        @SerializedName("title") val title: String,
        @SerializedName("location") val location: String,
        @SerializedName("price") val price: Int,
        @SerializedName("post_image") val postImage: String
    )
}
