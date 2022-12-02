package com.martinz.post_detail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PostDetailTopBar(modifier : Modifier = Modifier, label : String , onBackClick : () -> Unit) {

    Row(modifier = modifier
        .fillMaxWidth()
        .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            modifier = Modifier.padding(5.dp).size(30.dp).clickable { onBackClick() },
            imageVector = Icons.Rounded.ArrowBack,
            contentDescription = "return to news feed",
        tint = Color.White)
        Text(modifier = Modifier.padding(5.dp) , text = label , color = Color.White)
    }

}