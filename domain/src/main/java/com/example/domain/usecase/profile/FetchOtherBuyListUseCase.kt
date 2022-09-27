package com.example.domain.usecase.profile

import com.example.domain.entity.profile.FetchOtherBuyListEntity
import com.example.domain.entity.profile.FetchOtherWishListEntity
import com.example.domain.respository.ProfileRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class FetchOtherBuyListUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
): UseCase<Long, FetchOtherBuyListEntity>() {
    override suspend fun execute(data: Long): FetchOtherBuyListEntity =
        profileRepository.fetchBuyPost(data)
}