package com.example.domain.usecase.post

import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.param.post.CreatePostParam
import com.example.domain.respository.PostRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreatePostUseCase @Inject constructor(
    private val postRepository: PostRepository
): UseCase<CreatePostParam, Unit>() {
    override suspend fun execute(data: CreatePostParam) {
        postRepository.createPost(data)
    }
}