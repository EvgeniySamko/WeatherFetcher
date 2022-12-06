package com.example.weatherfetcher.weather_screen.feature.data.model

import com.google.gson.annotations.SerializedName

data class WeatherMainRemoteModel(
    @SerializedName("temp")
    val temperature: String
)