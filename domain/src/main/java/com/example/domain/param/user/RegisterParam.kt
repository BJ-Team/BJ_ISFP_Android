package com.example.domain.param.user

import com.example.domain.enums.SexType

data class RegisterParam (
    val id: String,
    val password: String,
    val name: String,
    val place: String,
    val sex: SexType
)