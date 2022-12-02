package com.martinz.model.dto

import com.martinz.model.dto.RedditPostDto

data class RedditResponseDataDto(
    val children : List<RedditPostDto>
)