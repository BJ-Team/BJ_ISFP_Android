package com.example.data.local.datasource.implementation

import com.example.data.local.dao.PostDao
import com.example.data.local.datasource.declaration.LocalPostDataSource
import com.example.data.local.storage.declaration.PostStorage
import javax.inject.Inject

class LocalPostDataSourceImpl @Inject constructor(
    val postDao: PostDao,
    val postStorage: PostStorage
): LocalPostDataSource {
}