package com.example.domain.usecase.profile

import com.example.domain.entity.profile.FetchOtherWishListEntity
import com.example.domain.respository.ProfileRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class FetchOtherWishListUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
): UseCase<Long, FetchOtherWishListEntity>() {
    override suspend fun execute(data: Long): FetchOtherWishListEntity =
        profileRepository.fetchWishPost(data)
}