package com.example.classwork.di

import com.example.classwork.repository.Repository
import com.example.classwork.useCase.DataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object UseCaseModule {
    @Provides
    suspend fun providesUseCase(repository: Repository):DataUseCase{
        return DataUseCase(repository)
    }
}