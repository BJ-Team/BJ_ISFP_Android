package com.example.data.remote.response.user

import com.google.gson.annotations.SerializedName

data class UserReissueResponse(
    @SerializedName("access_token") val accessToken: String,
    @SerializedName("expired_at") val expiredAt: String,
    @SerializedName("refresh_token") val refreshToken: String
)
