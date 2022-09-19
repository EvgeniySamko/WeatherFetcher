package com.example.weatherfetcher.weather_screen.data

import com.example.weatherfetcher.weather_screen.data.model.WeatherRemoteModel

class WeatherRemoteSource(private val api: WeatherApi) {


    //TODO edd query
    suspend fun getWeather(): WeatherRemoteModel {
        return api.getWeather(query = "Tyumen")
    }
}