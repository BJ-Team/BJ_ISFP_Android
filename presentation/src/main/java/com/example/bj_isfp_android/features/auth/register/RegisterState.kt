package com.example.bj_isfp_android.features.auth.register

import com.example.bj_isfp_android.base.MviState
import com.example.domain.enums.SexType

data class RegisterState(
    val id: String,
    val password: String,
    val name: String,
    val place: String,
    val sex: SexType
): MviState {
    companion object {
        fun initial() =
            RegisterState(id = "", password = "", name = "", place = "", sex = SexType.NULL)
    }
}