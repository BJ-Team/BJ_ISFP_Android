package com.example.bj_isfp_android.di.module

import com.example.data.local.storage.declaration.*
import com.example.data.local.storage.implementation.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class StorageModule {
    @Binds
    abstract fun provideAuthDataStorage(
        authDataStorageImpl: AuthDataStorageImpl
    ): AuthDataStorage
}