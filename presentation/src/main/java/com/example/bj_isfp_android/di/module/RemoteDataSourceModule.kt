package com.example.bj_isfp_android.di.module

import com.example.data.remote.datasource.declaration.*
import com.example.data.remote.datasource.implementation.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun provideRemoteUserDataSource(
        remoteUserDataSourceImpl: RemoteUserDataSourceImpl
    ): RemoteUserDataSource

    @Binds
    abstract fun provideRemotePostDataSource(
        remotePostDataSourceImpl: RemotePostDataSourceImpl
    ): RemotePostDataSource

    @Binds
    abstract fun provideRemoteMyPageDataSource(
        remoteMyPageDataSourceImpl: RemoteMyPageDataSourceImpl
    ): RemoteMyPageDataSource

    @Binds
    abstract fun provideRemoteProfileDataSource(
        remoteProfileDataSourceImpl: RemoteProfileDataSourceImpl
    ): RemoteProfileDataSource

    @Binds
    abstract fun provideRemoteDailyLifeDataSource(
        remoteDailyLifeDataSourceImpl: RemoteDailyLifeDataSourceImpl
    ): RemoteDailyLifeDataSource
}