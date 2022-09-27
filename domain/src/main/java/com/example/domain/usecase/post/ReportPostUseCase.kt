package com.example.domain.usecase.post

import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.param.post.PostReportParam
import com.example.domain.respository.PostRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReportPostUseCase @Inject constructor(
    private val postRepository: PostRepository
): UseCase<PostReportParam, Unit>() {
    override suspend fun execute(data: PostReportParam) {
        postRepository.reportPost(data)
    }
}