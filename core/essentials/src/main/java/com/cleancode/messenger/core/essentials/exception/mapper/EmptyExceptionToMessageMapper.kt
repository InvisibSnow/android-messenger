package com.cleancode.messenger.core.essentials.exception.mapper

class EmptyExceptionToMessageMapper: ExceptionToMessageMapper {
    override fun getLocalizedMessage(exception: Exception): String {
        return exception.message ?: "Unknow error occurred"
    }
}