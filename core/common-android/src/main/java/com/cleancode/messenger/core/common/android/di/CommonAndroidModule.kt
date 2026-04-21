package com.cleancode.messenger.core.common.android.di

import com.cleancode.messenger.core.common.android.AndroidLogger
import com.cleancode.messenger.core.common.android.resources.CoreStringProviderImpl
import com.cleancode.messenger.core.essentials.exception.mapper.DefaultExceptionToMessageMapper
import com.cleancode.messenger.core.essentials.exception.mapper.ExceptionToMessageMapper
import com.cleancode.messenger.core.essentials.logger.Logger
import com.cleancode.messenger.core.essentials.resources.CoreStringProvider
import com.cleancode.messenger.core.essentials.resources.StringProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
interface CommonAndroidModule {

    @Binds
    fun bindLogger(logger: AndroidLogger): Logger

    @Binds
    @IntoMap
    @ClassKey(CoreStringProvider::class)
    fun bindCoreStringProvider(impl: CoreStringProviderImpl): StringProvider

    @Binds
    fun bindExceptionToMessageMapper(impl: DefaultExceptionToMessageMapper): ExceptionToMessageMapper


}