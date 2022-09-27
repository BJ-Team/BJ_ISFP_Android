package com.example.domain.usecase.post

import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.param.post.PatchPostParam
import com.example.domain.respository.PostRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PatchPostUseCase @Inject constructor(
    private val postRepository: PostRepository
): UseCase<PatchPostParam, Unit>() {
    override suspend fun execute(data: PatchPostParam) {
        postRepository.patchPost(data)
    }
}