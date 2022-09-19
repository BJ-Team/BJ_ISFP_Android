package com.example.data.local.roomentity.mypage

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.mypage.FetchMyPageEntity

@Entity(tableName = "myPage")
data class FetchMyPageRoomEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val name: String,
    val nowMyLocation: String,
    val userProfile: String
)

fun FetchMyPageRoomEntity.toEntity() =
    FetchMyPageEntity(
        name = name,
        nowMyLocation = nowMyLocation,
        userProfile = userProfile
    )

fun FetchMyPageEntity.toDbEntity() =
    FetchMyPageRoomEntity(
        name = name,
        nowMyLocation = nowMyLocation,
        userProfile = userProfile
    )