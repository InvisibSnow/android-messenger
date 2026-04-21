package com.cleancode.messenger.core.essentials.exception.base

abstract class AbstractAppException(
    message: String,
    cause: Throwable? = null,
) : Exception(message, cause)