package com.martinz.local.dao

import androidx.room.*
import com.martinz.model.reddit_news.RedditPost
import kotlinx.coroutines.flow.Flow


@Dao
interface RedditNewsDao {


    @Query("SELECT * FROM redditNews")
    fun getAllNews() : Flow<List<RedditPost>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAsteroids(redditPost : List<RedditPost>)

    @Query("DELETE FROM redditNews")
    suspend fun deleteAllNews()

    @Query("SELECT * FROM redditNews WHERE id=:postId")
    fun getPost(postId : String) : RedditPost


}