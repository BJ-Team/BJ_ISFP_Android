package com.example.bj_isfp_android.di.module

import com.example.data.interceptor.AuthorizationInterceptor
import com.example.data.remote.api.DailyLifeApi
import com.example.data.remote.api.MyPageApi
import com.example.data.remote.api.PostApi
import com.example.data.remote.api.UserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {
    private const val BASE_URL = "http://3.36.200.236:8080/"

    @Provides
    fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

    @Provides
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        authorizationInterceptor: AuthorizationInterceptor
    ): OkHttpClient =
        OkHttpClient
            .Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(authorizationInterceptor)
            .build()

    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun dailyLifeApi(retrofit: Retrofit): DailyLifeApi =
        retrofit.create(DailyLifeApi::class.java)

    @Provides
    fun myPageApi(retrofit: Retrofit): MyPageApi =
        retrofit.create(MyPageApi::class.java)

    @Provides
    fun postApi(retrofit: Retrofit): PostApi =
        retrofit.create(PostApi::class.java)

    @Provides
    fun profileApi(retrofit: Retrofit): PostApi =
        retrofit.create(PostApi::class.java)

    @Provides
    fun userApi(retrofit: Retrofit): UserApi =
        retrofit.create(UserApi::class.java)
}