package com.example.domain.entity.profile

import com.google.gson.annotations.SerializedName

data class FetchOtherSellListEntity(
    @SerializedName("sell_product_list") val sell_product_list: MySellProductList
) {
    data class MySellProductList(
        @SerializedName("post_id") val postId: Long,
        @SerializedName("title") val title: String,
        @SerializedName("location") val location: String,
        @SerializedName("post_image") val postImage: String,
        @SerializedName("price") val price: Int
    )
}