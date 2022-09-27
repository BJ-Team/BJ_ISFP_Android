package com.example.domain.usecase.profile

import com.example.domain.entity.mypage.FetchMySellListEntity
import com.example.domain.entity.profile.FetchOtherSellListEntity
import com.example.domain.respository.ProfileRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class FetchOtherSellLiseUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
): UseCase<Long, FetchOtherSellListEntity>() {
    override suspend fun execute(data: Long): FetchOtherSellListEntity =
        profileRepository.fetchSellPost(data)
}