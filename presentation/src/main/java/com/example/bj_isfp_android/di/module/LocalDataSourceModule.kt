package com.example.bj_isfp_android.di.module

import com.example.data.local.datasource.declaration.LocalDailyLifeDataSource
import com.example.data.local.datasource.declaration.LocalMyPageDataSource
import com.example.data.local.datasource.declaration.LocalProfileDataSource
import com.example.data.local.datasource.declaration.LocalUserDataSource
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
    ): LocalUserDataSource

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