package com.example.weatherfetcher.feature.data.model

import com.example.weatherfetcher.feature.ui.model.WeatherModel

fun WeatherRemoteModel.toDomain() = WeatherModel(
    temperature = this.main.temperature
)