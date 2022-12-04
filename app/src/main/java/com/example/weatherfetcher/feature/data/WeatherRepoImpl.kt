package com.example.weatherfetcher.feature.data

import com.example.weatherfetcher.feature.data.model.toDomain
import com.example.weatherfetcher.feature.ui.model.WeatherModel

class WeatherRepoImpl(private val weatherRemoteSource: WeatherRemoteSource) : WeatherRepo {
    override suspend fun getTemperature(): WeatherModel {
        return weatherRemoteSource.getWeather().toDomain()
    }
}