package com.example.weatherfetcher.feature.data

import com.example.weatherfetcher.feature.data.model.WeatherRemoteModel

class WeatherRemoteSource(private val api: WeatherApi) {


    //TODO edd query
    suspend fun getWeather(): WeatherRemoteModel {
        return api.getWeather(query = "Tyumen")
    }
}