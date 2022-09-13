package com.example.data.remote.datasource.implementation

import com.example.data.remote.api.PostApi
import com.example.data.remote.datasource.declaration.RemotePostDataSource
import com.example.data.remote.request.post.CreatePostRequest
import com.example.data.remote.request.post.PatchPostRequest
import com.example.data.remote.request.post.PostReportRequest
import com.example.data.remote.response.post.FetchPostListResponse
import com.example.data.util.HttpHandler
import javax.inject.Inject

class RemotePostDataSourceImpl @Inject constructor(
    private val postApi: PostApi
) : RemotePostDataSource {

    override suspend fun fetchPost() = HttpHandler<FetchPostListResponse>()
        .httpRequest { postApi.fetchPost() }
        .sendRequest()

    override suspend fun createPost(
        createPostRequest: CreatePostRequest
    ) = HttpHandler<Unit>()
        .httpRequest { postApi.createPost(createPostRequest) }
        .sendRequest()

    override suspend fun patchMyPost(
        postId: Long,
        patchPostRequest: PatchPostRequest
    )= HttpHandler<Unit>()
        .httpRequest { postApi.patchMyPost(
            postId,
            patchPostRequest,
        ) }
        .sendRequest()

    override suspend fun deleteMyPost(
        postId: Long
    )= HttpHandler<Unit>()
        .httpRequest { postApi.deleteMyPost(postId) }
        .sendRequest()

    override suspend fun reportPost(
        postReportRequest: PostReportRequest
    )= HttpHandler<Unit>()
        .httpRequest { postApi.reportPost(postReportRequest) }
        .sendRequest()

    override suspend fun pickWishPost(
        postId: Long
    )= HttpHandler<Unit>()
        .httpRequest { postApi.pickWishPost(postId) }
        .sendRequest()

    override suspend fun deleteWishPost(
        postId: Long
    )= HttpHandler<Unit>()
        .httpRequest { postApi.deleteWishPost(postId) }
        .sendRequest()
}