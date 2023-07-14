package data.remote.service

import data.remote.dto.current.Current
import data.remote.dto.forecast.WeatherForecastResponse
import data.remote.dto.search.SearchItemResponse

/**
 * Created by Mohamed Elgohary on 7/14/2023.*/

interface SkyCastService {
    suspend fun getWeather(cityName: String): Current
    suspend fun getCityName(cityName: String): List<SearchItemResponse>
    suspend fun getForecastDays(cityName: String): WeatherForecastResponse
    suspend fun getForecastHours(cityName: String): WeatherForecastResponse

}