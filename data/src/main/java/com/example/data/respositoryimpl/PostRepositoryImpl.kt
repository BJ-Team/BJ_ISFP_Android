package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalPostDataSource
import com.example.data.remote.datasource.declaration.RemotePostDataSource
import com.example.data.remote.request.post.CreatePostRequest
import com.example.data.remote.request.post.PatchPostRequest
import com.example.data.remote.request.post.PostReportRequest
import com.example.data.remote.response.post.toEntity
import com.example.data.util.OfflineCacheUtil
import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.param.post.CreatePostParam
import com.example.domain.param.post.PatchPostParam
import com.example.domain.param.post.PostReportParam
import com.example.domain.respository.PostRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val remotePostDataSource: RemotePostDataSource,
    private val localPostDataSource: LocalPostDataSource
) : PostRepository {
    override suspend fun fetchPost(): Flow<FetchPostListEntity> =
        OfflineCacheUtil<FetchPostListEntity>()
            .remoteData { remotePostDataSource.fetchPost().toEntity() }
            .localData { localPostDataSource.fetchPost() }
            .doOnNeedRefresh { localPostDataSource.savePost(it) }
            .createFlow()

    override suspend fun createPost(
        createPostParam: CreatePostParam
    ) = remotePostDataSource.createPost(createPostParam.toRequest())

    override suspend fun patchPost(
        patchPostParam: PatchPostParam
    ) = remotePostDataSource.patchMyPost(
        patchPostParam.postId,
        patchPostParam.toRequest()
    )

    override suspend fun deletePost(
        postId: Long
    ) = remotePostDataSource.deleteMyPost(postId)

    override suspend fun reportPost(postReportParam: PostReportParam) =
        remotePostDataSource.reportPost(postReportParam.toRequest())

    override suspend fun pickWishPost(postId: Long) =
        remotePostDataSource.pickWishPost(postId)

    override suspend fun deleteWishPost(postId: Long) =
        remotePostDataSource.deleteWishPost(postId)

    private fun CreatePostParam.toRequest() =
        CreatePostRequest(
            title = title,
            content = content,
            category = category,
            price = price,
            postImage = postImage
        )

    private fun PatchPostParam.toRequest() =
        PatchPostRequest(
            title = title,
            content = content,
            category = category,
            price = price,
            postImage = postImage
        )

    private fun PostReportParam.toRequest() =
        PostReportRequest(
            title = title,
            content = content,
            postId = postId
        )
}