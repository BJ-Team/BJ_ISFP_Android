package com.example.data.remote.request.user

import com.example.domain.enums.SexType
import com.google.gson.annotations.SerializedName

data class UserSignUpRequest(
    @SerializedName("account_id") val id: String,
    @SerializedName("password") val password: String,
    @SerializedName("name") val name: String,
    @SerializedName("place") val place: String,
    @SerializedName("sex") val sex: SexType
)
