package com.example.weatherfetcher

import com.example.weatherfetcher.weather_screen.base.Either
import com.example.weatherfetcher.weather_screen.base.attempt
import com.example.weatherfetcher.weather_screen.feature.data.WeatherRepo
import com.example.weatherfetcher.weather_screen.feature.ui.model.WeatherModel
import com.example.weatherfetcher.weather_screen.feature.ui.model.WindModel

class WeatherInteractor(private val weatherRepo: WeatherRepo) {

    suspend fun getWeather(): Either<Throwable, WeatherModel> {
        return attempt { weatherRepo.getTemperature() }
    }

    suspend fun getWind(): Either<Throwable, WindModel> {
        return attempt { weatherRepo.getWind() }
    }
}
