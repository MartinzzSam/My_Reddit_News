
package com.martinz.post_detail.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.martinz.core.util.Screen
import com.martinz.post_detail.PostDetailScreen


fun NavController.navigateToPostDetailScreen(navOptions: NavOptions? = null , postId: String) {
    this.navigate(Screen.PostDetail.passPostId(postId), navOptions)
}

fun NavGraphBuilder.postDetailScreen(onNavigate :() -> Unit) {
    composable(route = Screen.PostDetail.route) {
        val postId = it.arguments?.getString("id")
        PostDetailScreen(onNavigate = onNavigate , postId ?: "")
    }
}
