package com.example.bj_isfp_android.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel<S : MviState, E: MviEvent> : ViewModel() {

    private val reducer = BaseViewModelReducer()

    abstract val initialState: S
    val state: StateFlow<S> = reducer.state

    abstract fun reduceEvent(oldState: S, event: E)

    inner class BaseViewModelReducer: Reducer<S, E>(initialState) {

        override fun reduce(oldState: S, event: E) {
            reduceEvent(oldState, event)
        }
    }

    fun sendEvent(event: E) {
        reducer.sendEvent(event)
    }

    fun setState(state: S) {
        reducer.setState(state)
    }
}