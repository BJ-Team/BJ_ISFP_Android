package com.example.domain.param.post

import com.example.domain.enums.PostCategoryType

data class CreatePostParam (
    val title: String,
    val content: String,
    val category: PostCategoryType,
    val price: Int,
    val postImage: String
)
