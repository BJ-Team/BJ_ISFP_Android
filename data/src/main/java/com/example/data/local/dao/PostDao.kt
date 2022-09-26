package com.example.data.local.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.roomentity.post.FetchPostListRoomEntity

interface PostDao {

    @Query("SELECT * FROM post")
    suspend fun fetchPost(): FetchPostListRoomEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePost(fetchPostListRoomEntity: FetchPostListRoomEntity)
}