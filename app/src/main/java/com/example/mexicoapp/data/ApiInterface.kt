package com.example.mexicoapp.data

import com.example.mexicoapp.data.weatherModels.CurrentWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather?")
    suspend fun getCurrentWeather(
        @Query("q") place: String,
        @Query("units") units: String,
        @Query("lang") lang: String,
        @Query("appid") apiKey: String
    ): Response<CurrentWeather>

}