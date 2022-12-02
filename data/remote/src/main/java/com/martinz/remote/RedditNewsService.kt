package com.martinz.remote


import com.martinz.model.dto.RedditResponseDto
import retrofit2.http.GET

interface RedditNewsService {

    @GET("kotlin/.json")
    suspend fun getRedditNews() : RedditResponseDto
}