package com.example.weatherfetcher.weather_screen.feature.data.model

import com.example.weatherfetcher.weather_screen.feature.ui.model.WeatherModel
import com.example.weatherfetcher.weather_screen.feature.ui.model.WindModel

fun WeatherRemoteModel.temperatureToDomain() = WeatherModel(
    temperature = this.main.temperature
)

fun WeatherRemoteModel.windToDomain() = WindModel(
    windDeg = this.wind.windDeg
)