package com.example.domain.usecase.post

import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.respository.PostRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchPostUseCase @Inject constructor(
    private val postRepository: PostRepository
): UseCase<Unit, Flow<FetchPostListEntity>>() {
    override suspend fun execute(data: Unit): Flow<FetchPostListEntity> =
        postRepository.fetchPost()
}