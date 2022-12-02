package com.martinz.app

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.martinz.app.ui.theme.RedditNewsTheme
import com.martinz.core.util.Screen
import com.martinz.news_list.navigation.newsScreen
import com.martinz.post_detail.navigation.navigateToPostDetailScreen
import com.martinz.post_detail.navigation.postDetailScreen

import com.martinz.redditnews.core.util.NetworkConnectivityObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    lateinit var connectivity: NetworkConnectivityObserver

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        connectivity = NetworkConnectivityObserver(applicationContext)
        super.onCreate(savedInstanceState)
        setContent {
            RedditNewsTheme {


                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Screen.Home.route) {


                    newsScreen(
                        { navController.navigateToPostDetailScreen(postId = it) },
                        connectivity
                    )

                    postDetailScreen { navController.navigateUp() }


                }
            }
        }
    }
}

