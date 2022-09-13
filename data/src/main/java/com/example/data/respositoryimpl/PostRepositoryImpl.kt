package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalPostDataSource
import com.example.data.remote.datasource.declaration.RemotePostDataSource
import com.example.domain.respository.PostRepository
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    val remotePostDataSource: RemotePostDataSource,
    val localPostDataSource: LocalPostDataSource
): PostRepository {
}