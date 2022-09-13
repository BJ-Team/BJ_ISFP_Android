package com.example.data.remote.datasource.declaration

import com.example.data.remote.request.post.CreatePostRequest
import com.example.data.remote.request.post.PatchPostRequest
import com.example.data.remote.request.post.PostReportRequest
import com.example.data.remote.response.post.FetchPostListResponse

interface RemotePostDataSource {

    suspend fun fetchPost(): FetchPostListResponse

    suspend fun createPost(createPostRequest: CreatePostRequest)

    suspend fun patchMyPost(postId: Long, patchPostRequest: PatchPostRequest)

    suspend fun deleteMyPost(postId: Long)

    suspend fun reportPost(postReportRequest: PostReportRequest)

    suspend fun pickWishPost(postId: Long)

    suspend fun deleteWishPost(postId: Long)
}