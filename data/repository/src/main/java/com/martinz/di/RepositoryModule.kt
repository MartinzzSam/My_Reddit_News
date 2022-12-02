package com.martinz.di

import com.martinz.local.db.RedditNewsDatabase
import com.martinz.remote.RedditNewsService
import com.martinz.repository.RedditRepository
import com.martinz.repository.RedditRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {



    @Provides
    @Singleton
    fun provideRedditRepository(api : RedditNewsService, database : RedditNewsDatabase) : RedditRepository = RedditRepositoryImpl(api, database)

}