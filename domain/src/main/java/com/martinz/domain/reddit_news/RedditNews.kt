package com.martinz.domain.reddit_news


// I usually create this class when i have more than one useCase to prevent multiple injection at viewModel
data class RedditNews(
    val GetNewsFiltered : GetNewsFilteredByBody
)
