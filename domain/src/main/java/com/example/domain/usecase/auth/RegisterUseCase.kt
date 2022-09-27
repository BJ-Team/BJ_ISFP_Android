package com.example.domain.usecase.auth

import com.example.domain.param.user.RegisterParam
import com.example.domain.respository.UserRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val userRepository: UserRepository
): UseCase<RegisterParam, Unit>() {
    override suspend fun execute(data: RegisterParam) {
        userRepository.signUp(data)
    }
}