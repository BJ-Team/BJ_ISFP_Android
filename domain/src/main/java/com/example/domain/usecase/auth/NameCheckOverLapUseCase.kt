package com.example.domain.usecase.auth

import com.example.domain.respository.UserRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class NameCheckOverLapUseCase @Inject constructor(
    private val userRepository: UserRepository
): UseCase<String, Unit>() {
    override suspend fun execute(data: String) {
        userRepository.nameOverLapCheck(data)
    }
}