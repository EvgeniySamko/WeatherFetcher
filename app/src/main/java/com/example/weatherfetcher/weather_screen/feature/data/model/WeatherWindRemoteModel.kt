package com.example.weatherfetcher.weather_screen.feature.data.model

import com.google.gson.annotations.SerializedName

data class WeatherWindRemoteModel(
    @SerializedName("deg")
    val windDeg: String

)