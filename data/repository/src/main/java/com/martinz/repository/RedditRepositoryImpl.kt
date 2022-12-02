package com.martinz.repository


import androidx.room.withTransaction
import com.martinz.local.dao.RedditNewsDao
import com.martinz.local.db.RedditNewsDatabase
import com.martinz.model.reddit_news.RedditPost
import com.martinz.model.toRedditPostsList
import com.martinz.redditnews.core.util.Response
import com.martinz.redditnews.core.util.networkBoundResource
import com.martinz.remote.RedditNewsService

import kotlinx.coroutines.flow.Flow

import javax.inject.Inject

class RedditRepositoryImpl @Inject constructor(
    private val api : RedditNewsService,
    private val database: RedditNewsDatabase,
) : RedditRepository {

    private val redditDao = database.redditNewsDao()

    override fun getRedditNews(): Flow<Response<List<RedditPost>>> = networkBoundResource(
        query = { redditDao.getAllNews() },
        fetch = {api.getRedditNews()},
        saveFetchResult = {redditNews ->
            database.withTransaction {
                redditDao.deleteAllNews()
                redditDao.insertAsteroids(redditNews.data.children.toRedditPostsList())

            }
        }
    )

    override fun findPostById(postId: String): RedditPost = redditDao.getPost(postId)
}