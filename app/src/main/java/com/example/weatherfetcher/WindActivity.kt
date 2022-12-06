package com.example.weatherfetcher

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherfetcher.weather_screen.feature.ui.UiEvent
import com.example.weatherfetcher.weather_screen.feature.ui.ViewState
import com.example.weatherfetcher.weather_screen.feature.ui.WeatherScreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class WindActivity : AppCompatActivity() {
    private val viewModel: WeatherScreenViewModel by viewModel()
    private val tvWindDirection: TextView by lazy { findViewById(R.id.tvWindDirection) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)

        viewModel.viewState.observe(this, ::render)
        viewModel.processUiEvent(UiEvent.WindIsLoaded)
    }

    private fun render(viewState: ViewState) {
        val windInfo = "${viewState.windDeg} "
        tvWindDirection.text = windInfo
    }
}
