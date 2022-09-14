package com.example.data.local.roomentity.mypage

data class FetchMyBuyListRoomEntity(
    val buy_product_list: List<MyBuyProductList>
) {
    data class MyBuyProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String
    )
}
