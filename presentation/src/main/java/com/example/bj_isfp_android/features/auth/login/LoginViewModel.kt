package com.example.bj_isfp_android.features.auth.login

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bj_isfp_android.base.BaseViewModel
import com.example.bj_isfp_android.uill.MutableEventFlow
import com.example.bj_isfp_android.uill.asEventFlow
import com.example.domain.exeption.BadRequestException
import com.example.domain.exeption.ConflictException
import com.example.domain.exeption.NotFoundException
import com.example.domain.param.user.LoginParam
import com.example.domain.usecase.auth.LoginUseCase
import com.example.domain.usecase.auth.NameCheckOverLapUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
): BaseViewModel<LoginState, LoginEvent>() {

    private val _eventFlow = MutableEventFlow<LoginEvent>()
    val eventFlow = _eventFlow.asEventFlow()

    private val parameter =
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

    fun postLogin() {
        viewModelScope.launch {
            kotlin.runCatching {
                withContext(Dispatchers.Default) {
                    loginUseCase.execute(parameter)
                }
            }.onSuccess {
                event(LoginEvent.Success)
            }.onFailure {
                when(it) {
                    is BadRequestException -> LoginEvent.BadRequestException
                    is NotFoundException -> LoginEvent.NotFoundException
                    is ConflictException -> LoginEvent.ConflictException
                    else -> LoginEvent.UnKnownException
                }
            }
        }
    }

    private fun event(event: LoginEvent) {
        viewModelScope.launch {
            _eventFlow.emit(event)
        }
    }
}