package com.cleancode.messenger.core.common.android.di

import com.cleancode.messenger.core.common.android.AndroidLogger
import com.cleancode.messenger.core.common.android.resources.AndroidStringProvider
import com.cleancode.messenger.core.essentials.logger.Logger
import com.cleancode.messenger.core.essentials.resources.StringProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface CommonAndroidModule {

    @Binds
    fun bindLogger(logger: AndroidLogger): Logger

    @Binds
    fun bindStringProvider(impl: AndroidStringProvider): StringProvider

}