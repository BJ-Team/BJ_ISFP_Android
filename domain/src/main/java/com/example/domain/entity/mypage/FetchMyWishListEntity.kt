package com.example.domain.entity.mypage

data class FetchMyWishListEntity(
    val sellProductList: List<SellProductList>
) {
    data class SellProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val price: Int,
        val postImage: String
    )
}
