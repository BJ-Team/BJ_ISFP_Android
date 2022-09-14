package com.example.data.local.roomentity.profile

data class FetchOtherBuyListRoomEntity(
    val buy_product_list: List<MyBuyProductList>
) {
    data class MyBuyProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String
    )
}
