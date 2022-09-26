package com.example.data.local.datasource.implementation

import com.example.data.local.dao.PostDao
import com.example.data.local.datasource.declaration.LocalPostDataSource
import com.example.data.local.roomentity.post.toDbEntity
import com.example.data.local.roomentity.post.toEntity
import com.example.domain.entity.post.FetchPostListEntity
import javax.inject.Inject

class LocalPostDataSourceImpl @Inject constructor(
    private val postDao: PostDao
): LocalPostDataSource {
    override suspend fun fetchPost(): FetchPostListEntity =
        postDao.fetchPost().toEntity()

    override suspend fun savePost(list: FetchPostListEntity) =
        postDao.savePost(list.toDbEntity())
}