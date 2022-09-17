package com.example.data.local.datasource.declaration

import com.example.domain.entity.post.FetchPostListEntity

interface LocalPostDataSource {

    suspend fun fetchPost(): FetchPostListEntity

    suspend fun savePost(list: FetchPostListEntity)
}