package com.example.weatherfetcher.weather_screen.feature.data

import com.example.weatherfetcher.weather_screen.feature.ui.model.WeatherModel
import com.example.weatherfetcher.weather_screen.feature.ui.model.WindModel

interface WeatherRepo {

    suspend fun getTemperature(): WeatherModel
    suspend fun getWind(): WindModel
}