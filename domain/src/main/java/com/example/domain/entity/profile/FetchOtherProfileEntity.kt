package com.example.domain.entity.profile

import com.google.gson.annotations.SerializedName

data class FetchOtherProfileEntity(
    @SerializedName("user_id") val userId: Int,
    @SerializedName("name") val name: String,
    @SerializedName("user_profile") val userProfile: String
)