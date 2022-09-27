package com.example.domain.usecase.post

import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.respository.PostRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DeletePostUseCase @Inject constructor(
    private val postRepository: PostRepository
): UseCase<Long, Unit>() {
    override suspend fun execute(data: Long) {
        postRepository.deletePost(data)
    }
}