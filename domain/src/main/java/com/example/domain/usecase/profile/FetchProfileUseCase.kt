package com.example.domain.usecase.profile

import com.example.domain.entity.profile.FetchOtherProfileEntity
import com.example.domain.respository.ProfileRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class FetchProfileUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
): UseCase<Long, FetchOtherProfileEntity>() {
    override suspend fun execute(data: Long): FetchOtherProfileEntity =
        profileRepository.fetchProfile(data)
}