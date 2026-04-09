package com.cleancode.messenger.core.common.android

import android.app.Application
import com.cleancode.messenger.core.essentials.logger.Logger
import timber.log.Timber

abstract class AbstractApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        Logger.set(AndroidLogger())
    }

}