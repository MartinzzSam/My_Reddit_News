package com.martinz.domain.reddit_news.di

import com.martinz.domain.reddit_news.GetNewsFilteredByBody
import com.martinz.domain.reddit_news.RedditNews
import com.martinz.repository.RedditRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideRedditNewsUseCase(repository: RedditRepository) : RedditNews = RedditNews(
        GetNewsFiltered = GetNewsFilteredByBody(repository)
    )
}