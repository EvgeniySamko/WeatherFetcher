package com.example.weatherfetcher.feature.weather_screen

import android.app.Application
import com.example.weatherfetcher.feature.di.weatherScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(weatherScreenModule)
        }
    }
}