package com.shriram.mvvmpractice

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

// ViewModel
class CounterViewModel : ViewModel() {
    private val _counterState = MutableStateFlow(CounterState())
    val counterState: StateFlow<CounterState> = _counterState

    fun increment() {
        _counterState.value = CounterState(_counterState.value.count + 1)
    }

    fun decrement() {
        _counterState.value = CounterState(_counterState.value.count - 1)
    }
}
