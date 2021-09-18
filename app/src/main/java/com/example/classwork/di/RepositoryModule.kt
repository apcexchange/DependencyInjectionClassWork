package com.example.classwork.di

import com.example.classwork.network.ApiService
import com.example.classwork.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {
    @Provides
    fun providesDataRepo(apiService: ApiService): Repository {
        return Repository(apiService)
    }
}