package com.martinz.model

import com.martinz.model.dto.RedditPostDto
import com.martinz.model.reddit_news.RedditPost



fun List<RedditPostDto>.toRedditPostsList() : List<RedditPost> = map { redditPostDto ->


        RedditPost(
            id = redditPostDto.data.id,
            thumbnail = redditPostDto.data.thumbnail,
            title = redditPostDto.data.title,
            postBody = redditPostDto.data.selftext
        )

    }
