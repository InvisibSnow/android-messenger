package com.cleancode.messenger.core.essentials.exception

import com.cleancode.messenger.core.essentials.exception.base.AbstractCoreAppException
import com.cleancode.messenger.core.essentials.exception.base.WithLocalizedMessage
import com.cleancode.messenger.core.essentials.resources.CoreStringProvider

class ConnectionException(cause: Throwable? = null) :
    AbstractCoreAppException("Network Error", cause), WithLocalizedMessage {

    override fun getLocalizedErrorMessage(stringProvider: CoreStringProvider): String {
        return stringProvider.connectionErrorMessage
    }

}