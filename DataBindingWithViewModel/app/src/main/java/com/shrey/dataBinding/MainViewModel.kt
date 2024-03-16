package com.shrey.dataBinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val qq9 = MutableLiveData<String>("With great power comes\ngreat responsibility")
    val smrs: MutableLiveData<String>
        get() = qq9


    fun updateLiveData() {
        qq9.value = "Great responsibility comes with great power"

    }
}