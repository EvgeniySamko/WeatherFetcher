package com.example.weatherfetcher.feature.weather_screen.data

import com.example.weatherfetcher.feature.weather_screen.data.model.WeatherRemoteModel

class WeatherRemoteSource(private val api: WeatherApi) {


    //TODO edd query
    suspend fun getWeather(): WeatherRemoteModel {
        return api.getWeather(query = "Tyumen")
    }
}