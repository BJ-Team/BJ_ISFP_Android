package com.example.data.local.datasource.implementation

import com.example.data.local.dao.MyPageDao
import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.local.storage.declaration.MyPageStorage
import javax.inject.Inject

class LocalMyPageDataSourceImpl @Inject constructor(
    val myPageDao: MyPageDao,
    val myPageStorage: MyPageStorage
): LocalMyPageDataSource {
}