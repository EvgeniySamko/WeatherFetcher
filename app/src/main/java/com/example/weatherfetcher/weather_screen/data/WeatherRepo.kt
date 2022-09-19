package com.example.weatherfetcher.weather_screen.data

interface WeatherRepo {

    suspend fun getTemperature(): String
}