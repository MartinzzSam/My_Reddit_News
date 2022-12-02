package com.martinz.post_detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.martinz.core.util.Props
import com.martinz.model.reddit_news.RedditPost
import com.martinz.repository.RedditRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PostDetailViewModel @Inject constructor(
    private val repository: RedditRepository
) : ViewModel() {

     var post by mutableStateOf<RedditPost?>(null)
    private set

    var isLoading by mutableStateOf(false)
    private set


    fun onEvent(event : PostDetailEvent) {
        when(event) {

            is PostDetailEvent.GetPost -> {
                viewModelScope.launch(Dispatchers.IO) {
                    isLoading = true
                    post = repository.findPostById(event.postId)
                    isLoading = false
                }
            }
        }
    }
}