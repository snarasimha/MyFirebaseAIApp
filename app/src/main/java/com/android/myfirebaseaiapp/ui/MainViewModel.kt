package com.android.myfirebaseaiapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.myfirebaseaiapp.data.AiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val aiRepository: AiRepository
) : ViewModel() {

    private val _response = MutableLiveData<String>()
    val response: LiveData<String> = _response

    fun onButtonClick(prompt: String) {
        viewModelScope.launch {
            val result = aiRepository.generateText(prompt)
            _response.value = result
        }
    }
}