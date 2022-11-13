package com.example.weatherfetcher.base


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<VIEW_STATE> : ViewModel() {

    val viewState: MutableLiveData<VIEW_STATE> by lazy { MutableLiveData(initialViewState()) }

    abstract fun initialViewState(): VIEW_STATE

    abstract fun reduse(event: Event, previousState: VIEW_STATE): VIEW_STATE?

    fun processUiEvent(event: Event) {
        updateState(event)
    }

    protected fun processDateEvent(event: Event) {
        updateState(event)
    }

    private fun updateState(event: Event) {
        val newViewState = reduse(event, viewState.value ?: initialViewState())
        if (newViewState != null && newViewState != viewState.value) {
            viewState.value = newViewState
        }
    }
}