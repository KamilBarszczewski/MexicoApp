package com.example.mexicoapp.model

import com.example.mexicoapp.R

data class Place(
    val placeId: Int,
    val placeImage: Int,
    val placeName: Int,
    val placeTranslate: Int,
    val placeSnippet: Int,
    val placeDescription1: Int,
    val placeDescription2: Int = R.string.dummy_text,
    val placeDescription3: Int = R.string.dummy_text,
    val placeType: Int,
    val placeWeather: Int = R.string.weather_fairbanks
)
