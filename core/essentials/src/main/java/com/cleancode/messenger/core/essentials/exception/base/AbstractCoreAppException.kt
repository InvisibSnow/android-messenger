package com.cleancode.messenger.core.essentials.exception.base

import com.cleancode.messenger.core.essentials.exception.base.WithLocalizedMessage
import com.cleancode.messenger.core.essentials.resources.CoreStringProvider
import com.cleancode.messenger.core.essentials.resources.StringProviderStore

abstract class AbstractCoreAppException(
    message: String,
    cause: Throwable? = null,
) : AbstractAppException(message, cause), WithLocalizedMessage {

    override fun getLocalizedErrorMessage(stringProviderStore: StringProviderStore): String {
        return getLocalizedErrorMessage(stringProviderStore<CoreStringProvider>())
    }

    abstract fun getLocalizedErrorMessage(stringProvider: CoreStringProvider): String
}