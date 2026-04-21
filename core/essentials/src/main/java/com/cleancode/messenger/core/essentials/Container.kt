package com.cleancode.messenger.core.essentials

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


sealed class Container<out T> {
    data object Loading : Container<Nothing>()
    data class Error(val exception: Exception) : Container<Nothing>()
    data class Success<T>(val value: T) : Container<T>()
}

fun <T, R> Container<T>.map(mapper: (T) -> R): Container<R> {
    return when (this) {
        is Container.Loading -> Container.Loading
        is Container.Error -> this
        is Container.Success<T> -> {
            val mappedValue: R = mapper(value)
            Container.Success(mappedValue)
        }
    }
}

fun <T, R> Flow<Container<T>>.containerMap(mapper: (T) -> R): Flow<Container<R>> {
    return map { container ->
        container.map(mapper)
    }
}