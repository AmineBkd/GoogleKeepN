package com.example.googlekeepn.viewModel.note

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class NoteScreenViewModel: ViewModel() {
    private val _titleState = MutableStateFlow(TitleState.VIEW)
    val titleState: StateFlow<TitleState> = _titleState.asStateFlow()

    fun titleStateEdit(){ _titleState.value = TitleState.EDIT }
    fun titleStateView(){ _titleState.value = TitleState.VIEW }
}

enum class TitleState{
    EDIT,
    VIEW
}