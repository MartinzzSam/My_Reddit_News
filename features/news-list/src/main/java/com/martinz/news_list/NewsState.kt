package com.martinz.news_list

import com.martinz.model.reddit_news.RedditPost


data class NewsState(
    val posts : List<RedditPost> = listOf(),
    val isLoading : Boolean = false
)
