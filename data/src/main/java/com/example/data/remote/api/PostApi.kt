package com.example.data.remote.api

import com.example.data.remote.request.post.CreatePostRequest
import com.example.data.remote.request.post.PatchPostRequest
import com.example.data.remote.request.post.PostReportRequest
import com.example.data.remote.response.post.FetchPostListResponse
import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.*

interface PostApi {

    @GET(IsFpApiUrl.Post.post)
    suspend fun fetchPost(
        @Header("Authorization") accessToken: String
    ): FetchPostListResponse

    @POST(IsFpApiUrl.Post.post)
    suspend fun createPost(
        @Header("Authorization") accessToken: String,
        @Body createPostRequest: CreatePostRequest
    )

    @PATCH(IsFpApiUrl.Post.editPost)
    suspend fun patchMyPost(
        @Header("Authorization") accessToken: String,
        @Path ("post-id") postId: Long,
        @Body patchPostRequest: PatchPostRequest
    )

    @DELETE(IsFpApiUrl.Post.editPost)
    suspend fun deleteMyPost(
        @Header("Authorization") accessToken: String,
        @Path ("post-id") postId: Long
    )

    @POST(IsFpApiUrl.Post.reportPost)
    suspend fun reportPost(
        @Header("Authorization") accessToken: String,
        @Body postReportRequest: PostReportRequest
    )

    @POST(IsFpApiUrl.Post.wishPost)
    suspend fun pickWishPost(
        @Header("Authorization") accessToken: String,
        @Path ("post-id") postId: Long
    )

    @DELETE(IsFpApiUrl.Post.wishPost)
    suspend fun deleteWishPost(
        @Header("Authorization") accessToken: String,
        @Path ("post-id") postId: Long
    )
}