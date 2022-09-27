package com.example.domain.usecase.dailylife

import com.example.domain.entity.mypage.FetchMyPageEntity
import com.example.domain.param.dailylife.CreateDailyLifeParam
import com.example.domain.respository.DailyLifeRepository
import com.example.domain.respository.MyPageRepository
import com.example.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreateDailyLifeUseCase @Inject constructor(
    private val dailyLifeRepository: DailyLifeRepository
): UseCase<CreateDailyLifeParam, Unit>() {
    override suspend fun execute(data: CreateDailyLifeParam) {
        dailyLifeRepository.createDailyLifePost(data)
    }
}