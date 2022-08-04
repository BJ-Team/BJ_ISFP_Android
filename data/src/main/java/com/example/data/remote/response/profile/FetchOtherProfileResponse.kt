package com.example.data.remote.response.profile

import com.google.gson.annotations.SerializedName

data class FetchOtherProfileResponse(
    @SerializedName("user_id") val userId: Int,
    @SerializedName("name") val name: String,
    @SerializedName("user_profile") val userProfile: String
)