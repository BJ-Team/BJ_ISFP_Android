package com.example.data.respositoryimpl

import com.example.data.remote.datasource.declaration.RemoteProfileDataSource
import com.example.domain.respository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    val remoteProfileDataSource: RemoteProfileDataSource,
    val localProfileDataSource: RemoteProfileDataSource
): ProfileRepository {
}