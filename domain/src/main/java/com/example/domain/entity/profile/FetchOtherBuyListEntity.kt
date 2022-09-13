package com.example.domain.entity.profile

data class FetchOtherBuyListEntity(
    val buy_product_list: MyBuyProductList
) {
    data class MyBuyProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String
    )
}
