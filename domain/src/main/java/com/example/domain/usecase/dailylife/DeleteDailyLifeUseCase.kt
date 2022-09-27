package com.example.domain.usecase.dailylife

import com.example.domain.param.dailylife.CreateDailyLifeParam
import com.example.domain.respository.DailyLifeRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class DeleteDailyLifeUseCase @Inject constructor(
    private val dailyLifeRepository: DailyLifeRepository
): UseCase<Long, Unit>() {
    override suspend fun execute(data: Long) {
        dailyLifeRepository.deleteDailyLifePost(data)
    }
}