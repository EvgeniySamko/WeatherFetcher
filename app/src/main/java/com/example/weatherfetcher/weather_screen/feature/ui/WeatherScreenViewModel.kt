package com.example.weatherfetcher.weather_screen.feature.ui

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.weatherfetcher.WeatherInteractor
import com.example.weatherfetcher.weather_screen.base.BaseViewModel
import com.example.weatherfetcher.weather_screen.base.Event
import kotlinx.coroutines.launch

class WeatherScreenViewModel(private val interactor: WeatherInteractor) :
    BaseViewModel<ViewState>() {

    override fun InitialViewState(): ViewState =
        ViewState(isLoading = false, title = "Hello", temperature = "", windDeg = "")

    override fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UiEvent.OnButtonClicked -> {
                viewModelScope.launch {
                    interactor.getWeather().fold(
                        onError = {
                            processDataEvent(DataEvent.OnWeatherFetchFailed(error = it))
                            it.localizedMessage?.let { it1 -> Log.e("ERROR", it1) }
                        },
                        onSuccess = {
                            processDataEvent(DataEvent.OnWeatherFetchSucceed(temperature = "Температура: ${it.temperature}"))
                        }

                    )
                }

                return previousState.copy(isLoading = true)
            }

            is UiEvent.WindIsLoaded -> {
                viewModelScope.launch {
                    interactor.getWind().fold(
                        onError = {
                            processDataEvent(DataEvent.OnWeatherFetchFailed(error = it))
                        },
                        onSuccess = {
                            processDataEvent(DataEvent.OnWindFetchSucceed(windDeg = "Направление ветра: ${it.windDeg}"))
                        }
                    )
                }
                return previousState.copy(isLoading = true)
            }
            is DataEvent.OnWeatherFetchSucceed -> {
                return previousState.copy(isLoading = false, temperature = event.temperature)
            }
            is DataEvent.OnWindFetchSucceed -> {
                return previousState.copy(isLoading = false, windDeg = event.windDeg)
            }
            else -> return null
        }
    }
}