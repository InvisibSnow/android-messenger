package com.cleancode.messenger.feature.presentation


import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

import androidx.hilt.navigation.compose.hiltViewModel
import com.cleancode.messenger.feature.presentation.InitViewModel.State


@Composable
fun InitScreen() {
    val viewModel: InitViewModel = hiltViewModel()
    val state: State by viewModel.stateFlow.collectAsState()
    InitContent(state = state)
}

@Composable
fun InitContent(state: State) {
    when (state) {
        is State.Loading -> {}
        is State.Error -> {}
        is State.Success -> {}
    }
}