package com.example.domain.entity.mypage

data class FetchMySellListEntity(
    val sell_product_list: List<MySellProductList>
) {
    data class MySellProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val postImage: String,
        val price: Int
    )
}