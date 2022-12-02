package com.martinz.core.util


const val POST_ID_ARGUMENT_KEY = "id"
sealed class Screen(val route : String) {

    object Home : Screen("reddit")
    object PostDetail : Screen("post_detail/{$POST_ID_ARGUMENT_KEY}")
    fun passPostId(postId : String) : String {
        return "post_detail/$postId"
    }
}
