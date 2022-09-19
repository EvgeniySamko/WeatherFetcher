package com.example.weatherfetcher.weather_screen.ui

import com.example.weatherfetcher.weather_screen.WeatherInteractor

class WeatherScreenPresenter(val interactor: WeatherInteractor) {

    suspend fun getWeather(): String {
        return interactor.getWeather()
    }
}