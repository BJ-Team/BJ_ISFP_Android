package com.example.domain.usecase.auth

import com.example.domain.param.user.PatchPassWordParam
import com.example.domain.respository.UserRepository
import com.example.domain.usecase.UseCase
import javax.inject.Inject

class PatchPasswordUseCase @Inject constructor(
    private val userRepository: UserRepository
): UseCase<PatchPassWordParam, Unit>() {
    override suspend fun execute(data: PatchPassWordParam) {
        userRepository.patchPassWord(data)
    }
}