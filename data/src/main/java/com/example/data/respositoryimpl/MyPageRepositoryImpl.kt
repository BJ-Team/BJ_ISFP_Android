package com.example.data.respositoryimpl

import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.remote.datasource.declaration.RemoteMyPageDataSource
import com.example.domain.respository.MyPageRepository
import javax.inject.Inject

class MyPageRepositoryImpl @Inject constructor(
    val remoteMyPageDataSource: RemoteMyPageDataSource,
    val localMyPageDataSource: LocalMyPageDataSource
): MyPageRepository {
}