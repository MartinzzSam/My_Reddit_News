package com.martinz.news_list

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.martinz.core.util.NetworkStatus
import com.martinz.news_list.components.NewsFeedTopBar
import com.martinz.news_list.components.PostItem


@Composable
fun NewsScreen(
    onNavigate : (String) -> Unit,
    status: NetworkStatus,
    viewModel: NewsViewModel = hiltViewModel()
) {


    val state by viewModel.state.collectAsState()


    Scaffold(
        topBar = { NewsFeedTopBar(status) }
    ) { padding ->

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


            if (state.isLoading) {
                item {
                    CircularProgressIndicator()
                }
            } else if(state.posts.isEmpty()){

                item {
                    Text(text = "No Data In Local DB Please Connect to Internet :)")
                }

            }else {
                items(state.posts) { post ->
                    PostItem(
                        modifier = Modifier.padding(10.dp),
                        post = post,
                        onClick = { onNavigate(it) }
                    )

                }

            }



        }
    }

}

//
//@Composable
//fun LottieExample() {
//    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.reddit))
//    LottieAnimation(composition = composition, iterations = LottieConstants.IterateForever)
//
//}