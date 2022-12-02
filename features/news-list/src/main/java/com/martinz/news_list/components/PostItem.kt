package com.martinz.news_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.martinz.model.reddit_news.RedditPost


@Composable
fun PostItem(
    modifier : Modifier = Modifier,
    post: RedditPost,
    onClick : (String) -> Unit
) {


    Card(
        modifier = modifier.fillMaxWidth()
            .clickable { onClick(post.id) },
        shape = RoundedCornerShape(25),
    ) {
        Column {

            Text(
                modifier = Modifier.align(Start).padding(10.dp),
                text = post.title )


            if (post.thumbnail.isNotBlank()) {
                AsyncImage(
                    modifier = Modifier.size(60.dp).aspectRatio(1f),
                    model = post.thumbnail,
                    contentDescription = "Post Image" )

            }

        }

    }

}