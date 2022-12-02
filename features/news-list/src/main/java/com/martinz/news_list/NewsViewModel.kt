package com.martinz.news_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.martinz.core.util.Props
import com.martinz.domain.reddit_news.RedditNews
import com.martinz.redditnews.core.util.Response

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
    private val useCase: RedditNews
) : ViewModel() {


    private val _state = MutableStateFlow(NewsState())
    val state = _state.asStateFlow()


    init {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.GetNewsFiltered().collect { response ->
                when (response) {

                    is Response.Loading -> {
                        _state.value = _state.value.copy(isLoading = true)
                    }

                    is Response.Success -> {
                        _state.value = _state.value.copy(isLoading = false, posts = response.data)
                    }

                    is Response.Error -> {
                        _state.value = _state.value.copy(isLoading = false, posts = response.data ?: listOf())
                    }
                }

            }
        }

    }
}