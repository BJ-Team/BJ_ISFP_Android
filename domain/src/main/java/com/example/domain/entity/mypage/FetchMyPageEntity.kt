package com.example.domain.entity.mypage

import com.google.gson.annotations.SerializedName

data class FetchMyPageEntity(
    @SerializedName("name") val name: String,
    @SerializedName("now_my_location") val nowMyLocation: String,
    @SerializedName("user_profile") val userProfile: String
)