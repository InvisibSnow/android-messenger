package com.cleancode.messenger.core.essentials.exception

import com.cleancode.messenger.core.essentials.exception.base.AbstractCoreAppException
import com.cleancode.messenger.core.essentials.resources.CoreStringProvider

class BackEndException(
    val httpCode: Int = 400,
    val backendMessage: String = "",
    cause: Throwable? = null,
): AbstractCoreAppException("Server Error", cause){

    override fun getLocalizedErrorMessage(stringProvider: CoreStringProvider): String {
        return stringProvider.backendErrorMessage(httpCode, backendMessage)
    }
}