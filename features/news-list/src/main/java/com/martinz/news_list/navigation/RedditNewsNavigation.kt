
package com.martinz.news_list.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.martinz.core.util.Screen
import com.martinz.news_list.NewsScreen
import com.martinz.redditnews.core.util.NetworkConnectivityObserver
import com.martinz.core.util.NetworkStatus



fun NavController.navigateToNewsScreen(navOptions: NavOptions? = null) {
    this.navigate(Screen.Home.route, navOptions)
}

@RequiresApi(Build.VERSION_CODES.N)
fun NavGraphBuilder.newsScreen(onNavigate :(String) -> Unit, connectivityObserver : NetworkConnectivityObserver) {
    composable(route = Screen.Home.route) {
        val status by connectivityObserver.observe().collectAsState(initial = NetworkStatus.Unavailable)
        NewsScreen(onNavigate = onNavigate , status = status)
    }
}
