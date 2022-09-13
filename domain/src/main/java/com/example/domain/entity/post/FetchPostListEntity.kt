package com.example.domain.entity.post

data class FetchPostListEntity(
    val nowMyLocation: String,
    val postList: PostList
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
