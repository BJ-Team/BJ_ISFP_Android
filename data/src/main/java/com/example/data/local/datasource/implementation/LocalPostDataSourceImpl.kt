package com.example.data.local.datasource.implementation

import com.example.data.local.dao.PostDao
import com.example.data.local.datasource.declaration.LocalPostDataSource
import com.example.data.local.storage.declaration.PostStorage
import com.example.domain.entity.post.FetchPostListEntity
import javax.inject.Inject

class LocalPostDataSourceImpl @Inject constructor(
    val postDao: PostDao,
    val postStorage: PostStorage
): LocalPostDataSource {
    override suspend fun fetchPost(): FetchPostListEntity {
        TODO("Not yet implemented")
    }

    override suspend fun savePost(list: FetchPostListEntity) {
        TODO("Not yet implemented")
    }
}