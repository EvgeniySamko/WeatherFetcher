package com.example.weatherfetcher.weather_screen.data.ui

import com.example.weatherfetcher.weather_screen.data.WeatherRepo

class WeatherInteractor(private val weatherRepo: WeatherRepo) {

    fun getWeather(): String {
        return weatherRepo.getTemperature()

    }
}