package com.example.domain.usecase.dailylife

import com.example.domain.entity.dailylife.FetchDailyLifePostEntity
import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.enums.DailyLifeType
import com.example.domain.respository.DailyLifeRepository
import com.example.domain.respository.MyPageRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchDailyLifeUseCase @Inject constructor(
    private val dailyLifeRepository: DailyLifeRepository
): UseCase<DailyLifeType, Flow<FetchDailyLifePostEntity>>() {
    override suspend fun execute(data: DailyLifeType): Flow<FetchDailyLifePostEntity> =
        dailyLifeRepository.fetchDailyLifePost(data)
}