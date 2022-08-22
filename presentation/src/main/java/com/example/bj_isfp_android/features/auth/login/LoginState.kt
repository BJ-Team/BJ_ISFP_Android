package com.example.bj_isfp_android.features.auth.login

import com.example.bj_isfp_android.base.MviState

data class LoginState(
    val id: String,
    val password: String
) : MviState {
    companion object {
        fun initial() =
            LoginState(id = "", password = "")
    }
}
