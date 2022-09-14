package com.example.data.local.roomentity.profile

data class FetchOtherWishListRoomEntity(
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
