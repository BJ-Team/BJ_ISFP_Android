package com.example.bj_isfp_android.features.auth.login

import com.example.bj_isfp_android.base.MviEvent

sealed class LoginEvent : MviEvent {
    data class InputEmail(val email: String) : LoginEvent()
    data class InputPassword(val password: String) : LoginEvent()
    object BadRequestException : LoginEvent()
    object NotFoundException : LoginEvent()
    object ConflictException : LoginEvent()
}
