package com.example.data.local.roomentity.post

data class FetchPostListRoomEntity(
    val nowMyLocation: String,
    val postList: List<PostList>
) {
    data class PostList(
        val title: String,
        val location: String,
        val createTime: String,
        val price: Int,
        val postImage: String,
        val postId: Long
    )
}
