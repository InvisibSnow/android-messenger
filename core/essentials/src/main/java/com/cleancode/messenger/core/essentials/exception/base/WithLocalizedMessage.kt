package com.cleancode.messenger.core.essentials.exception.base

import com.cleancode.messenger.core.essentials.resources.StringProviderStore

interface WithLocalizedMessage {
    fun getLocalizedErrorMessage(stringProviderStore: StringProviderStore): String
}