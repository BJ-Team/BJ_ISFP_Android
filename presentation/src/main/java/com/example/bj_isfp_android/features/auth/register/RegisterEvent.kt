package com.example.bj_isfp_android.features.auth.register

import com.example.bj_isfp_android.base.MviEvent
import com.example.bj_isfp_android.features.auth.login.LoginEvent
import com.example.domain.enums.SexType

sealed class RegisterEvent: MviEvent {
    data class InputId(val id: String): RegisterEvent()
    data class InputPassword(val password: String): RegisterEvent()
    data class InputName(val name: String): RegisterEvent()
    data class InputPlace(val place: String): RegisterEvent()
    data class InputSex(val sex: SexType): RegisterEvent()
    object PossibleName: RegisterEvent()
    object SuccessNameCheck: RegisterEvent()
    object SuccessRegister: RegisterEvent()
    object BadRequestException: RegisterEvent()
    object NotFoundException: RegisterEvent()
    object ConflictException: RegisterEvent()
    object UnKnownException: RegisterEvent()
}