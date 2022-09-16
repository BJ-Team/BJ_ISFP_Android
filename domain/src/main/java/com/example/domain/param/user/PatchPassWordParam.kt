package com.example.domain.param.user

data class PatchPassWordParam(
    val accountId: String,
    val newPassword: String
)
