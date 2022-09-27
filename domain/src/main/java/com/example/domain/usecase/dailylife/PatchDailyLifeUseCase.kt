package com.example.domain.usecase.dailylife

import com.example.domain.param.dailylife.CreateDailyLifeParam
import com.example.domain.param.dailylife.PatchDailyLifeParam
import com.example.domain.respository.DailyLifeRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class PatchDailyLifeUseCase @Inject constructor(
    private val dailyLifeRepository: DailyLifeRepository
): UseCase<PatchDailyLifeParam, Unit>() {
    override suspend fun execute(data: PatchDailyLifeParam) {
        dailyLifeRepository.patchDailyLifePost(data)
    }
}