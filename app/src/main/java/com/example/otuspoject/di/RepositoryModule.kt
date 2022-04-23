package com.example.otuspoject.di

import com.example.otuspoject.repository.FilmRepository
import com.example.otuspoject.repository.FilmRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun filmRepository(impl : FilmRepositoryImpl) : FilmRepository
}