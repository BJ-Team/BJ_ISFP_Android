package com.example.bj_isfp_android.features.auth.login

import com.example.bj_isfp_android.base.BaseViewModel
import com.example.domain.param.user.LoginParam
import com.example.domain.usecase.auth.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
): BaseViewModel<LoginState, LoginEvent>() {

    val parameter =
        LoginParam(id = state.value.id, password = state.value.password)

    fun setId(id: String) {
        sendEvent(LoginEvent.InputId(id))
    }

    fun setPassword(password: String) {
        sendEvent(LoginEvent.InputPassword(password))
    }

    override val initialState: LoginState
        get() = LoginState.initial()

    override fun reduceEvent(oldState: LoginState, event: LoginEvent) {
        when(event) {
            is LoginEvent.InputId -> {
                setState(oldState.copy(id = event.id))
            }
            is LoginEvent.InputPassword -> {
                setState(oldState.copy(password = event.password))
            }
            else -> {}
        }
    }
}