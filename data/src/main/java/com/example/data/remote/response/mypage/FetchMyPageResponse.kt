package com.example.data.remote.response.mypage

import com.google.gson.annotations.SerializedName

data class FetchMyPageResponse(
    @SerializedName("name") val name: String,
    @SerializedName("now_my_location") val nowMyLocation: String,
    @SerializedName("user_profile") val userProfile: String
)