package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalPostDataSource
import com.example.data.remote.datasource.declaration.RemotePostDataSource
import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.param.post.CreatePostParam
import com.example.domain.param.post.PatchPostParam
import com.example.domain.param.post.PostReportParam
import com.example.domain.respository.PostRepository
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    val remotePostDataSource: RemotePostDataSource,
    val localPostDataSource: LocalPostDataSource
): PostRepository {
    override suspend fun fetchPost(): FetchPostListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun createPost(createPostParam: CreatePostParam) {
        TODO("Not yet implemented")
    }

    override suspend fun patchPost(postId: Long, patchPostParam: PatchPostParam) {
        TODO("Not yet implemented")
    }

    override suspend fun deletePost(postId: Long) {
        TODO("Not yet implemented")
    }

    override suspend fun reportPost(postReportParam: PostReportParam) {
        TODO("Not yet implemented")
    }

    override suspend fun pickWishPost(postId: Long) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteWishPost(postId: Long) {
        TODO("Not yet implemented")
    }
}