package com.example.data.local.roomentity.mypage

import com.google.gson.annotations.SerializedName

data class FetchMyWishListRoomEntity(
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
