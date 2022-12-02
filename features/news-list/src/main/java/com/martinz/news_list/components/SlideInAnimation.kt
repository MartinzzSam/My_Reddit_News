package com.martinz.news_list.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import kotlinx.coroutines.delay

@Composable
fun SlideInAnimation(
    composable: @Composable () -> Unit,
    delayTime: Long = 500L,
    isHorizontally: Boolean = false,
    reversed : Boolean = false
) {

    val visible = rememberSaveable {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = visible.value) {
        delay(delayTime)
        visible.value = true

    }

    AnimatedVisibility(
        visible = visible.value,
        enter = if (!isHorizontally) slideInVertically(initialOffsetY = { if (reversed) -it else it })
        else slideInHorizontally(initialOffsetX = { if (reversed) -it else it }),
    ) {
        composable()
    }
}