package com.example.domain.usecase.mypage

import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.post.FetchPostListEntity
import com.example.domain.respository.MyPageRepository
import com.example.domain.respository.PostRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchMyPageUseCase @Inject constructor(
    private val myPageRepository: MyPageRepository
): UseCase<Unit, Flow<FetchMyPageEntity>>() {
    override suspend fun execute(data: Unit): Flow<FetchMyPageEntity> =
        myPageRepository.fetchMyPage()
}