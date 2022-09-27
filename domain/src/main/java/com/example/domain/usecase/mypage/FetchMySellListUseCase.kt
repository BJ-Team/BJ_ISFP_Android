package com.example.domain.usecase.mypage

import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.respository.MyPageRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchMySellListUseCase @Inject constructor(
    private val myPageRepository: MyPageRepository
): UseCase<Unit, Flow<FetchMySellListEntity>>() {
    override suspend fun execute(data: Unit): Flow<FetchMySellListEntity> =
        myPageRepository.fetchMySellList()
}