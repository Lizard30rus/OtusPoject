package com.example.otuspoject.di

import com.example.otuspoject.Constants.BASE_URL
import com.example.otuspoject.datasourse.WebDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


/**
 * Модуль для создания одиночных компонентов источника данных
 */
@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    fun provideWebDataSource() : WebDataSource {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(WebDataSource::class.java)
    }
}