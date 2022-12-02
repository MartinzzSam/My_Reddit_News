package com.martinz.post_detail

sealed interface PostDetailEvent {

    data class GetPost(val postId : String) : PostDetailEvent
}
