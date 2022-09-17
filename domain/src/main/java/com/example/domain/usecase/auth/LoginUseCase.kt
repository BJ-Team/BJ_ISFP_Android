package com.example.domain.usecase.auth

import com.example.domain.param.user.LoginParam
import com.example.domain.respository.UserRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val userRepository: UserRepository
): UseCase<LoginParam, Unit>() {
    override suspend fun execute(data: LoginParam) {
        userRepository.signIn(data)
    }
}