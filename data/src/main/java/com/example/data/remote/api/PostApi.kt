package com.example.data.remote.api

import com.example.data.remote.url.IsFpApiUrl
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST

interface PostApi {

    @GET(IsFpApiUrl.Post.post)
    suspend fun fetchPost()

    @POST(IsFpApiUrl.Post.post)
    suspend fun createPost()

    @PATCH(IsFpApiUrl.Post.editPost)
    suspend fun patchMyPost()

    @DELETE(IsFpApiUrl.Post.editPost)
    suspend fun deleteMyPost()

    @POST(IsFpApiUrl.Post.reportPost)
    suspend fun reportPost()

    @POST(IsFpApiUrl.Post.wishPost)
    suspend fun pickWishPost()

    @DELETE(IsFpApiUrl.Post.wishPost)
    suspend fun deleteWishPost()
}