package com.example.bj_isfp_android.features.auth.login

import com.example.bj_isfp_android.base.BaseViewModel
import com.example.domain.usecase.declaration.AuthLoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authLoginUseCase: AuthLoginUseCase
): BaseViewModel<LoginState, LoginEvent>() {

    fun setEmail(email: String) {
        sendEvent(LoginEvent.InputEmail(email))
    }

    fun setPassword(password: String) {
        sendEvent(LoginEvent.InputPassword(password))
    }

    override val initialState: LoginState
        get() = LoginState.initial()

    override fun reduceEvent(oldState: LoginState, event: LoginEvent) {
        TODO("Not yet implemented")
    }
}