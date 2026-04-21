package com.cleancode.messenger.feature.presentation.di

import com.cleancode.messenger.core.essentials.resources.StringProvider
import com.cleancode.messenger.feature.presentation.InitStringProviderImpl
import com.cleancode.messenger.feature.domain.resources.InitStringProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap


@Module
@InstallIn(SingletonComponent::class)
interface InitStringResourceModule {

    @Binds
    @IntoMap
    @ClassKey(InitStringProvider::class)
    fun bindInitStringProvider(impl: InitStringProviderImpl): StringProvider

}