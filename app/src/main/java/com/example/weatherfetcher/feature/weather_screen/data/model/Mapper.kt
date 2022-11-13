package com.example.weatherfetcher.feature.weather_screen.data.model

import com.example.weatherfetcher.feature.weather_screen.ui.model.WeatherModel

fun WeatherRemoteModel.toDomain() = WeatherModel(
    temperature = this.main.temperature
)