package com.example.data.local.datasource.implementation

import com.example.data.local.dao.ProfileDao
import com.example.data.local.datasource.declaration.LocalProfileDataSource
import com.example.data.local.storage.declaration.ProfileStorage
import javax.inject.Inject

class LocalProfileDataSourceImpl @Inject constructor(
    val profileDao: ProfileDao,
    val profileStorage: ProfileStorage
): LocalProfileDataSource {
}