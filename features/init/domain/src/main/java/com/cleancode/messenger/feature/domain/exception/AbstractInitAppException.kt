package com.cleancode.messenger.feature.domain.exception

import com.cleancode.messenger.core.essentials.exception.base.AbstractAppException
import com.cleancode.messenger.core.essentials.exception.base.WithLocalizedMessage
import com.cleancode.messenger.core.essentials.resources.StringProviderStore
import com.cleancode.messenger.feature.domain.resources.InitStringProvider

abstract class AbstractInitAppException(
    message: String,
    cause: Throwable? = null,
) : AbstractAppException(message, cause), WithLocalizedMessage {

    override fun getLocalizedErrorMessage(stringProviderStore: StringProviderStore): String {
        return getLocalizedErrorMessage(stringProviderStore<InitStringProvider>())
    }

    abstract fun getLocalizedErrorMessage(stringProvider: InitStringProvider): String
}