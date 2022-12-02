package com.martinz.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.martinz.local.dao.RedditNewsDao
import com.martinz.model.reddit_news.RedditPost


@Database(entities = [RedditPost::class] , version = 1)
abstract class RedditNewsDatabase : RoomDatabase() {

    abstract fun redditNewsDao() : RedditNewsDao
}