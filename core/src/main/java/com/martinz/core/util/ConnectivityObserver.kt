package com.martinz.redditnews.core.util

import com.martinz.core.util.NetworkStatus
import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {

    fun observe(): Flow<NetworkStatus>


}