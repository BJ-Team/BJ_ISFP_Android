package com.example.data.local.roomentity.profile

import com.google.gson.annotations.SerializedName

data class FetchOtherSellListRoomEntity(
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