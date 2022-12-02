package com.martinz.local.di

import android.content.Context
import androidx.room.Room
import com.martinz.local.db.RedditNewsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object LocalModule {


    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context ) : RedditNewsDatabase = Room.databaseBuilder(context ,
        RedditNewsDatabase::class.java,
        "reddit_news_database"
    ).build()

//    @Singleton
//    @Provides
//    fun provideDao(dataBase : RedditNewsDatabase) = dataBase.redditNewsDao()


}
