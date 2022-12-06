package com.example.weatherfetcher.weather_screen.feature.data

import com.example.weatherfetcher.API_KEY
import com.example.weatherfetcher.weather_screen.feature.data.model.WeatherRemoteModel
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") query: String,
        @Query("units") units: String = "metric",
        @Query("appid") appKye: String = API_KEY
    ): WeatherRemoteModel

}