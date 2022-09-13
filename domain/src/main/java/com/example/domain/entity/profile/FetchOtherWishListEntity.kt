package com.example.domain.entity.profile

data class FetchOtherWishListEntity(
    val sellProductList: SellProductList
) {
    data class SellProductList(
        val postId: Long,
        val title: String,
        val location: String,
        val price: Int,
        val postImage: String
    )
}
