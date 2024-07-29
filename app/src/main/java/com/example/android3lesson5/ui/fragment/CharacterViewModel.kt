package com.example.android3lesson5.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android3homework5mc5.data.models.DataItem
import com.example.android3lesson5.data.remote.repositories.CharacterRepository
import com.example.android3lesson5.utils.UiState

class CharacterViewModel : ViewModel() {

    private val repository = CharacterRepository()
    private val _uiState = MutableLiveData<UiState<List<DataItem>>>()

    val uistate: LiveData<UiState<List<DataItem>>> = _uiState
    fun getCharacters(query: String) {
        repository.searchHarryPotter(query = query,
            onResponse = { data ->
                _uiState.value = UiState(isLoading = false, success = data)

            },
            onFailure = {
                _uiState.value = UiState(isLoading = false, error = null)
            })
    }
}