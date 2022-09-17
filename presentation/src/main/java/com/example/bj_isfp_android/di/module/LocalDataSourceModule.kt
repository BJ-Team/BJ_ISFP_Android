package com.example.bj_isfp_android.di.module

import com.example.data.local.datasource.declaration.*
import com.example.data.local.datasource.implementation.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataSourceModule {

    @Binds
    abstract fun provideLocalUserDataSource(
        localUserDataSourceImpl: LocalUserDataSourceImpl
    ): LocalUserDataSource

    @Binds
    abstract fun provideLocalPostDataSource(
        localPostDataSourceImpl: LocalPostDataSourceImpl
    ): LocalPostDataSource

    @Binds
    abstract fun provideLocalMyPageDataSource(
        localMyPageDataSourceImpl: LocalMyPageDataSourceImpl
    ): LocalMyPageDataSource

    @Binds
    abstract fun provideLocalProfileDataSource(
        localProfileDataSourceImpl: LocalProfileDataSourceImpl
    ): LocalProfileDataSource

    @Binds
    abstract fun provideLocalDailyLifeDataSource(
        localDailyLifeDataSourceImpl: LocalDailyLifeDataSourceImpl
    ): LocalDailyLifeDataSource
}