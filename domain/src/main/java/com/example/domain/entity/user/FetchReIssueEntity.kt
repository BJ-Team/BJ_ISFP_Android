package com.example.domain.entity.user

data class FetchReIssueEntity(
    val accessToken: String,
    val expiredAt: String,
    val refreshToken: String
)
