package com.example.data.remote.request.user

import com.google.gson.annotations.SerializedName

data class UserPatchPasswordRequest(
    @SerializedName("account_id") val accountId: String,
    @SerializedName("new_password") val newPassword: String
)
