package com.example.weatherfetcher.weather_screen.feature.data

import com.example.weatherfetcher.weather_screen.feature.data.model.temperatureToDomain
import com.example.weatherfetcher.weather_screen.feature.data.model.windToDomain
import com.example.weatherfetcher.weather_screen.feature.ui.model.WeatherModel
import com.example.weatherfetcher.weather_screen.feature.ui.model.WindModel

class WeatherRepoImpl(private val weatherRemoteSource: WeatherRemoteSource) : WeatherRepo {
    override suspend fun getTemperature(): WeatherModel {
        return weatherRemoteSource.getWeather().temperatureToDomain()
    }

    override suspend fun getWind(): WindModel {
        return weatherRemoteSource.getWeather().windToDomain()
    }
}