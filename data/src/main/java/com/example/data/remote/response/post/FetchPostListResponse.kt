package com.example.data.remote.response.post

import com.example.domain.entity.post.FetchPostListEntity
import com.google.gson.annotations.SerializedName

data class FetchPostListResponse(
    @SerializedName("now_my_location") val nowMyLocation: String,
    @SerializedName("post_list") val postList: List<PostList>
) {
    data class PostList(
        @SerializedName("title") val title: String,
        @SerializedName("location") val location: String,
        @SerializedName("create_time") val createTime: String,
        @SerializedName("price") val price: Int,
        @SerializedName("post_image") val postImage: String,
        @SerializedName("post_id") val postId: Long
    )
}

fun FetchPostListResponse.PostList.toEntity() =
    FetchPostListEntity.PostList(
        title = title,
        location = location,
        createTime = createTime,
        price = price,
        postImage = postImage,
        postId = postId
    )

fun FetchPostListResponse.toEntity() =
    FetchPostListEntity(
        nowMyLocation = nowMyLocation,
        postList = postList.map { it.toEntity() }
    )