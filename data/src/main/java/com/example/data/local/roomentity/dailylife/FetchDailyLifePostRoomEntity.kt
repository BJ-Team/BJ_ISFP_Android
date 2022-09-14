package com.example.data.local.roomentity.dailylife

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.dailylife.FetchDailyLifePostEntity

@Entity(tableName = "dailyLife")
data class FetchDailyLifePostRoomEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val lifeList: List<LifeList>
) {
    data class LifeList(
        val title: String,
        val content: String,
        val createTime: String,
        val lifeImage: String,
        val lifeId: Long,
    )

    fun LifeList.toEntity() =
        FetchDailyLifePostEntity.LifeList(
            title = title,
            content = content,
            createTime = createTime,
            lifeImage = lifeImage,
            lifeId = lifeId,
        )
}

fun FetchDailyLifePostRoomEntity.toEntity() =
    FetchDailyLifePostEntity(
        lifeList = lifeList.map { it.toEntity() }
    )

fun FetchDailyLifePostEntity.toDbEntity() =
    FetchDailyLifePostRoomEntity(
        lifeList = lifeList.map { it.toDbEntity() }
    )

fun FetchDailyLifePostEntity.LifeList.toDbEntity() =
    FetchDailyLifePostRoomEntity.LifeList(
        title = title,
        content = content,
        createTime = createTime,
        lifeImage = lifeImage,
        lifeId = lifeId
    )