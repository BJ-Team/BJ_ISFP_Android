package com.example.domain.usecase.auth

import com.example.domain.entity.user.FetchReIssueEntity
import com.example.domain.respository.UserRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class RefreshTokenUseCase @Inject constructor(
    private val userRepository: UserRepository
): UseCase<String, FetchReIssueEntity>() {
    override suspend fun execute(data: String): FetchReIssueEntity =
        userRepository.refreshToken(data)
}