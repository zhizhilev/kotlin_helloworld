package ru.cursor.question.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _list = MutableLiveData<String>().apply {
        value = "Доступные истории"

    }
}