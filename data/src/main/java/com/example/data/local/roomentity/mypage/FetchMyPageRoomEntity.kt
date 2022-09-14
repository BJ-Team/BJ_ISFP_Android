package com.example.data.local.roomentity.mypage

import com.google.gson.annotations.SerializedName

data class FetchMyPageRoomEntity(
    val name: String,
    val nowMyLocation: String,
    val userProfile: String
)