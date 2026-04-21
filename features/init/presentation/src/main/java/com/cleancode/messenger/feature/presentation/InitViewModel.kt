package com.cleancode.messenger.feature.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cleancode.messenger.core.essentials.Container
import com.cleancode.messenger.core.essentials.containerMap
import com.cleancode.messenger.core.essentials.entities.KeyFeatures
import com.cleancode.messenger.core.essentials.exception.mapper.ExceptionToMessageMapper
import com.cleancode.messenger.core.essentials.map
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

interface GetKeyFeatureUseCase {
    operator fun invoke(): Flow<Container<KeyFeatures>>
}

@HiltViewModel
class InitViewModel @Inject constructor(
    private val getKeyFeatureUseCase: GetKeyFeatureUseCase,
    private val exception: ExceptionToMessageMapper
) : ViewModel() {

    val stateFlow: StateFlow<Container<State>> = getKeyFeatureUseCase
        .invoke()
        .containerMap { State(it) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(1000), Container.Loading)

    data class State(
        val keyFeatures: KeyFeatures,
    )

}