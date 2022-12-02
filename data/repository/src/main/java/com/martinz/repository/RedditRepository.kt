package com.martinz.repository

import com.martinz.model.reddit_news.RedditPost
import com.martinz.redditnews.core.util.Response
import kotlinx.coroutines.flow.Flow


interface RedditRepository {


    fun getRedditNews() : Flow<Response<List<RedditPost>>>

    fun findPostById(postId : String) : RedditPost

}