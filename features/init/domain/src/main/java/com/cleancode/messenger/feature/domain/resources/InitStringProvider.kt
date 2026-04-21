package com.cleancode.messenger.feature.domain.resources

import com.cleancode.messenger.core.essentials.resources.StringProvider

interface InitStringProvider: StringProvider {
    val deviceIsRootedErrorMessage: String
}