package com.example.weatherfetcher.weather_screen.data

class WeatherRemoteSource(private val api: WeatherApi) {


    //TODO edd query
    fun getWeather() {
        return api.getWeather(query = "Tyumene")
    }
}