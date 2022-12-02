package com.martinz.post_detail

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.martinz.post_detail.components.PostDetailTopBar

@Composable
fun PostDetailScreen(
    onNavigate: () -> Unit,
    postId: String,
    viewModel: PostDetailViewModel = hiltViewModel()
) {

    val post = viewModel.post

    LaunchedEffect(key1 = true) {
        viewModel.onEvent(PostDetailEvent.GetPost(postId))
    }

    Scaffold(
        topBar = {
            PostDetailTopBar(label = viewModel.post?.title ?: "", onBackClick = { onNavigate() })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            if (post != null) {

                if (post.thumbnail.isNotBlank()) {
                    AsyncImage(
                        modifier = Modifier
                            .size(80.dp)
                            .aspectRatio(1f),
                        model = viewModel.post!!.thumbnail,
                        contentDescription = "Post Thumbnail"
                    )
                }


                val scroll = rememberScrollState(0)
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                        .verticalScroll(scroll),
                    text = post.postBody.ifBlank { "Article With No Body :(" })


            }

        }
    }


}


