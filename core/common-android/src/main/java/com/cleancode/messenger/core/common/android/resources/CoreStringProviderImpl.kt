package com.cleancode.messenger.core.common.android.resources

import android.content.Context
import com.cleancode.messenger.core.essentials.resources.CoreStringProvider
import com.cleancode.templates.core.common.android.R
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class CoreStringProviderImpl @Inject constructor(
        @ApplicationContext private val context: Context,
    ): CoreStringProvider {

    override val connectionErrorMessage = context.getString(R.string.connection_error_message)

    override val unknownErrorMessage = context.getString(R.string.unknown_error_message)

    override fun backendErrorMessage(
        code: Int,
        backendMessage: String
    ) = context.getString(R.string.backend_error_message, code, backendMessage)
}