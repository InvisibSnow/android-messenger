package com.cleancode.messenger.feature.domain.exception.base

import com.cleancode.messenger.feature.domain.exception.AbstractInitAppException
import com.cleancode.messenger.feature.domain.resources.InitStringProvider

class DeviceIsRootedException: AbstractInitAppException("Device is rooted") {
    override fun getLocalizedErrorMessage(stringProvider: InitStringProvider): String {
        return stringProvider.deviceIsRootedErrorMessage
    }
}