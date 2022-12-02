package com.martinz.model.reddit_news

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "redditNews")
data class RedditPost(
    @PrimaryKey
    val id : String ,
    val thumbnail : String ,
    val title : String,
    val postBody : String
)
