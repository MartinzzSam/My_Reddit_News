package com.martinz.core.util


import androidx.compose.ui.graphics.Color

sealed class NetworkStatus(val color : Color , val status : String) {

    object Available : NetworkStatus(Color.Green , "Available")
    object Unavailable : NetworkStatus(Color.Gray , "Looking For Connection...")
    object Lost : NetworkStatus(Color.Red , "Lost")
    object Losing : NetworkStatus(Color.DarkGray , "Losing...")

}
