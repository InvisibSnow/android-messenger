package com.cleancode.messenger.core.essentials.resources

import javax.inject.Inject

class StringProviderStore @Inject constructor(
    @PublishedApi
    internal val stringProviders: Map<Class<*>, @JvmSuppressWildcards StringProvider>
) {

    inline operator fun <reified T: StringProvider> invoke(): T {
        return stringProviders[T::class.java] as T
    }

}