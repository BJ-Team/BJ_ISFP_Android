package com.example.data.local.roomentity.post

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.post.FetchPostListEntity

@Entity(tableName = "post")
data class FetchPostListRoomEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
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

    fun PostList.toEntity() =
        FetchPostListEntity.PostList(
            title = title,
            location = location,
            createTime = createTime,
            price = price,
            postImage = postImage,
            postId = postId
        )
}

fun FetchPostListRoomEntity.toEntity() =
    FetchPostListEntity(
        nowMyLocation = nowMyLocation,
        postList = postList.map { it.toEntity() }
    )

fun FetchPostListEntity.toDbEntity() =
    FetchPostListRoomEntity(
        nowMyLocation = nowMyLocation,
        postList = postList.map { it.toDbEntity() }
    )

fun FetchPostListEntity.PostList.toDbEntity() =
    FetchPostListRoomEntity.PostList(
        title = title,
        location = location,
        createTime = createTime,
        price = price,
        postImage = postImage,
        postId = postId
    )