package com.example.bj_isfp_android.features.auth.register

import androidx.lifecycle.Lifecycle.Event
import com.example.bj_isfp_android.base.BaseViewModel
import com.example.bj_isfp_android.uill.MutableEventFlow
import com.example.bj_isfp_android.uill.asEventFlow
import com.example.domain.enums.SexType
import com.example.domain.param.user.RegisterParam
import com.example.domain.usecase.auth.RegisterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    val registerUseCase: RegisterUseCase
): BaseViewModel<RegisterState, RegisterEvent>() {

    private val _eventFlow = MutableEventFlow<Event>()
    val eventFlow = _eventFlow.asEventFlow()

    val parameter =
        RegisterParam(
            id = state.value.id,
            password = state.value.password,
            name = state.value.name,
            place = state.value.place,
            sex = state.value.sex
        )

    fun setId(id: String) {
        sendEvent(RegisterEvent.InputId(id))
    }

    fun setPassword(password: String) {
        sendEvent(RegisterEvent.InputPassword(password))
    }

    fun setName(name: String) {
        sendEvent(RegisterEvent.InputName(name))
    }

    fun setPlace(place: String) {
        sendEvent(RegisterEvent.InputPlace(place))
    }

    fun setSex(sex: SexType) {
        sendEvent(RegisterEvent.InputSex(sex))
    }

    override val initialState: RegisterState
        get() = RegisterState.initial()

    override fun reduceEvent(oldState: RegisterState, event: RegisterEvent) {
        when(event) {
            is RegisterEvent.InputId -> {
                setState(oldState.copy(id = event.id))
            }

            is RegisterEvent.InputPassword -> {
                setState(oldState.copy(password = event.password))
            }

            is RegisterEvent.InputName -> {
                setState(oldState.copy(name = event.name))
            }

            is RegisterEvent.InputPlace -> {
                setState(oldState.copy(place = event.place))
            }

            is RegisterEvent.InputSex -> {
                setState(oldState.copy(sex = event.sex))
            }
            else -> {}
        }
    }

}