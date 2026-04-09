package com.cleancode.messenger.core.common.android.resources

import android.content.Context
import com.cleancode.messenger.core.essentials.resources.StringProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class AndroidStringProvider @Inject constructor(
        @ApplicationContext private val context: Context,
    ): StringProvider {
}