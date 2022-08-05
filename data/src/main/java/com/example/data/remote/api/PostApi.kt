package com.example.data.remote.api

import com.example.data.remote.request.post.CreatePostRequest
import com.example.data.remote.request.post.PatchPostRequest
import com.example.data.remote.request.post.PostReportRequest
import com.example.data.remote.response.post.FetchPostListResponse
import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.*

interface PostApi {

    @GET(IsFpApiUrl.Post.post)
    suspend fun fetchPost(): FetchPostListResponse

    @POST(IsFpApiUrl.Post.post)
    suspend fun createPost(
        @Body createPostRequest: CreatePostRequest
    )

    @PATCH(IsFpApiUrl.Post.editPost)
    suspend fun patchMyPost(
        @Path ("post-id") postId: Long,
        @Body patchPostRequest: PatchPostRequest
    )

    @DELETE(IsFpApiUrl.Post.editPost)
    suspend fun deleteMyPost(
        @Path ("post-id") postId: Long
    )

    @POST(IsFpApiUrl.Post.reportPost)
    suspend fun reportPost(
        @Body postReportRequest: PostReportRequest
    )

    @POST(IsFpApiUrl.Post.wishPost)
    suspend fun pickWishPost(
        @Path ("post-id") postId: Long
    )

    @DELETE(IsFpApiUrl.Post.wishPost)
    suspend fun deleteWishPost(
        @Path ("post-id") postId: Long
    )
}