package com.example.bj_isfp_android.features.auth.login

import com.example.bj_isfp_android.base.MviState

data class LoginState(
    val email: String,
    val password: String
) : MviState {
    companion object {
        fun initial() =
            LoginState(email = "", password = "")
    }
}
