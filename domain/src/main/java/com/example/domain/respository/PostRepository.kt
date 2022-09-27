package com.example.domain.respository

import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.param.post.CreatePostParam
import com.example.domain.param.post.PatchPostParam
import com.example.domain.param.post.PostReportParam
import kotlinx.coroutines.flow.Flow

interface PostRepository {

    suspend fun fetchPost(): Flow<FetchPostListEntity>

    suspend fun createPost(createPostParam: CreatePostParam)

    suspend fun patchPost(patchPostParam: PatchPostParam)

    suspend fun deletePost(postId: Long)

    suspend fun reportPost(postReportParam: PostReportParam)

    suspend fun pickWishPost(postId: Long)

    suspend fun deleteWishPost(postId: Long)
}