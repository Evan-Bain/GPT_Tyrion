package com.example.gpt_tyrion.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TyrionViewModel : ViewModel() {

    var inputText = MutableLiveData<String>()

    var outputText = MutableLiveData<String>()

    fun setOutputText(text: String) {
        outputText.value = text
    }
}