package com.example.data.local.roomentity.profile

import com.google.gson.annotations.SerializedName

data class FetchOtherProfileRoomEntity(
    val userId: Int,
    val name: String,
    val userProfile: String
)