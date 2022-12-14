package com.martinz.redditnews.core.util

import kotlinx.coroutines.flow.*

inline fun <ResultType , RequestType> networkBoundResource(
    crossinline query : () -> Flow<ResultType>,
    crossinline fetch: suspend () -> RequestType,
    crossinline saveFetchResult : suspend (RequestType) -> Unit,
    crossinline shouldFetch : (ResultType) -> Boolean = { true }
) = flow {
    val data = query().first()

   val flow = if (shouldFetch(data)) {
        emit(Response.Loading)
        try {
            saveFetchResult(fetch())
            query().map { Response.Success(it) }
        } catch (throwable : Throwable) {
            query().map { Response.Error(message = throwable.message.toString(), data = it) }
        }
    } else {
        query().map { Response.Success(it) }
    }

    emitAll(flow)
}