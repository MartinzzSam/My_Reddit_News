package com.martinz.news_list.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.martinz.core.util.NetworkStatus

@Composable
fun NewsFeedTopBar(networkStatus: NetworkStatus) {

    val animatedColor by animateColorAsState(
        targetValue = networkStatus.color,
        tween(500, 1500, LinearOutSlowInEasing)
    )

    Row(modifier = Modifier
        .fillMaxWidth()
        .background(animatedColor)
        .height(40.dp)
        .clip(RoundedCornerShape(25).copy(topStart = ZeroCornerSize , topEnd = ZeroCornerSize)),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically) {
        when(networkStatus) {
            NetworkStatus.Available -> {
                SlideInAnimation(
                    composable = {Text(text = networkStatus.status , fontWeight = FontWeight.Bold)},
                    reversed = true
                )

            }
            NetworkStatus.Unavailable -> {
                SlideInAnimation(
                    composable = {Text(text = networkStatus.status , fontWeight = FontWeight.Bold)},
                    reversed = true
                )
            }

            NetworkStatus.Lost -> {
                SlideInAnimation(
                    composable = {Text(text = networkStatus.status , fontWeight = FontWeight.Bold)},
                )
            }
        }
    }

}




