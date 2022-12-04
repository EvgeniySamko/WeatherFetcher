package com.example.weatherfetcher.feature.data

import com.example.weatherfetcher.feature.ui.model.WeatherModel

interface WeatherRepo {

    suspend fun getTemperature(): WeatherModel
}