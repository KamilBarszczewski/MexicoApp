package com.example.mexicoapp.data

import com.example.mexicoapp.R
import com.example.mexicoapp.constants.PlaceType
import com.example.mexicoapp.model.Place

object PlacesDataSource {
    fun getArchZoneData(): ArrayList<Place> {
        return arrayListOf(
            Place(
                placeId = 1,
                placeImage = R.drawable.img_chichen_itza,
                placeName = R.string.chichen_itza,
                placeTranslate = R.string.trans_chichen_itza,
                placeSnippet = R.string.discovery_chichen_itza,
                placeDescription1 = R.string.desc1_chichen_itza,
                placeDescription2 = R.string.desc2_chichen_itza,
                placeDescription3 = R.string.desc3_chichen_itza,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_chichen_itza
            ),
            Place(
                placeId = 2,
                placeImage = R.drawable.img_tulum,
                placeName = R.string.tulum,
                placeTranslate = R.string.trans_tulum,
                placeSnippet = R.string.discovery_tulum,
                placeDescription1 = R.string.desc1_tulum,
                placeDescription2 = R.string.desc1_tulum,
                placeDescription3 = R.string.desc1_tulum,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_tulum
            ),
            Place(
                placeId = 3,
                placeImage = R.drawable.img_coba,
                placeName = R.string.coba,
                placeTranslate = R.string.trans_coba,
                placeSnippet = R.string.discovery_coba,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_coba
            ),
            Place(
                placeId = 4,
                placeImage = R.drawable.img_ek_balam,
                placeName = R.string.ek_balam,
                placeTranslate = R.string.trans_ek_balam,
                placeSnippet = R.string.discovery_ek_balam,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_ek_balam
            ),
            Place(
                placeId = 5,
                placeImage = R.drawable.img_uxmal,
                placeName = R.string.uxmal,
                placeTranslate = R.string.trans_uxmal,
                placeSnippet = R.string.discovery_uxmal,
                placeDescription1 = R.string.desc1_uxmal,
                placeDescription2 = R.string.desc2_uxmal,
                placeDescription3 = R.string.desc3_uxmal,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_uxmal
            ),
            Place(
                placeId = 6,
                placeImage = R.drawable.img_yaxchilan,
                placeName = R.string.yaxchilan,
                placeTranslate = R.string.trans_yaxchilan,
                placeSnippet = R.string.discovery_yaxchilan,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_yaxchilan
            ),
            Place(
                placeId = 7,
                placeImage = R.drawable.img_bonampak,
                placeName = R.string.bonampak,
                placeTranslate = R.string.trans_bonampak,
                placeSnippet = R.string.discovery_bonampak,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_bonampak
            ),
            Place(
                placeId = 8,
                placeImage = R.drawable.img_palenque,
                placeName = R.string.palenque,
                placeTranslate = R.string.trans_palenque,
                placeSnippet = R.string.discovery_palenque,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_palenque
            ),
            Place(
                placeId = 9,
                placeImage = R.drawable.img_mitla,
                placeName = R.string.mitla,
                placeTranslate = R.string.trans_mitla,
                placeSnippet = R.string.discovery_mitla,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_mitla
            ),
            Place(
                placeId = 10,
                placeImage = R.drawable.img_monte_alban,
                placeName = R.string.monte_alban,
                placeTranslate = R.string.trans_monte_alban,
                placeSnippet = R.string.discovery_monte_alban,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_monte_alban
            ),
            Place(
                placeId = 11,
                placeImage = R.drawable.img_teotihuacan,
                placeName = R.string.teotihuacan,
                placeTranslate = R.string.trans_teotihuacan,
                placeSnippet = R.string.discovery_teotihuacan,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_teotihuacan
            ),
            Place(
                placeId = 12,
                placeImage = R.drawable.img_la_venta,
                placeName = R.string.la_venta,
                placeTranslate = R.string.trans_la_venta,
                placeSnippet = R.string.discovery_la_venta,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.ARCH_ZONE,
                placeWeather = R.string.weather_la_venta
            )
        )
    }

    fun getCityData(): ArrayList<Place> {
        return arrayListOf(
            Place(
                placeId = 1,
                placeImage = R.drawable.img_cancun,
                placeName = R.string.cancun,
                placeTranslate = R.string.trans_cancun,
                placeSnippet = R.string.founded_cancun,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_cancun
            ),
            Place(
                placeId = 2,
                placeImage = R.drawable.img_playa_del_carmen,
                placeName = R.string.playa_del_carmen,
                placeTranslate = R.string.trans_playa_del_carmen,
                placeSnippet = R.string.founded_playa_del_carmen,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_playa_del_carmen
            ),
            Place(
                placeId = 3,
                placeImage = R.drawable.img_tulum_city,
                placeName = R.string.tulum_city,
                placeTranslate = R.string.trans_tulum_city,
                placeSnippet = R.string.founded_tulum_city,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_tulum_city
            ),
            Place(
                placeId = 4,
                placeImage = R.drawable.img_valladolid,
                placeName = R.string.valladolid,
                placeTranslate = R.string.trans_valladolid,
                placeSnippet = R.string.founded_valladolid,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_valladolid
            ),
            Place(
                placeId = 5,
                placeImage = R.drawable.img_merida,
                placeName = R.string.merida,
                placeTranslate = R.string.trans_merida,
                placeSnippet = R.string.founded_merida,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_merida
            ),
            Place(
                placeId = 6,
                placeImage = R.drawable.img_campeche,
                placeName = R.string.campeche,
                placeTranslate = R.string.trans_campeche,
                placeSnippet = R.string.founded_campeche,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_campeche
            ),
            Place(
                placeId = 7,
                placeImage = R.drawable.img_san_cristobal,
                placeName = R.string.san_cristobal,
                placeTranslate = R.string.trans_san_cristobal,
                placeSnippet = R.string.founded_san_cristobal,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_san_cristobal
            ),
            Place(
                placeId = 8,
                placeImage = R.drawable.img_oaxaca,
                placeName = R.string.oaxaca,
                placeTranslate = R.string.founded_oaxaca,
                placeSnippet = R.string.trans_oaxaca,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_oaxaca
            ),
            Place(
                placeId = 9,
                placeImage = R.drawable.img_puebla,
                placeName = R.string.puebla,
                placeTranslate = R.string.founded_puebla,
                placeSnippet = R.string.trans_puebla,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_puebla
            ),
            Place(
                placeId = 10,
                placeImage = R.drawable.img_acapulco,
                placeName = R.string.acapulco,
                placeTranslate = R.string.founded_acapulco,
                placeSnippet = R.string.trans_acapulco,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_acapulco
            ),
            Place(
                placeId = 11,
                placeImage = R.drawable.img_ciudad_mexico,
                placeName = R.string.ciudad_mexico,
                placeTranslate = R.string.trans_ciudad_mexico,
                placeSnippet = R.string.founded_ciudad_mexico,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_mexico
            ),
            Place(
                placeId = 12,
                placeImage = R.drawable.img_taxco,
                placeName = R.string.taxco,
                placeTranslate = R.string.trans_taxco,
                placeSnippet = R.string.founded_taxco,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.CITY,
                placeWeather = R.string.weather_taxco
            ),
        )
    }

    fun getNatureData(): ArrayList<Place> {
        return arrayListOf(
            Place(
                placeId = 1,
                placeImage = R.drawable.img_celestun,
                placeName = R.string.celestun,
                placeTranslate = R.string.trans_celestun,
                placeSnippet = R.string.founded_celestun,
                placeDescription1 = R.string.desc1_celestun,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_celestun
            ),
            Place(
                placeId = 2,
                placeImage = R.drawable.img_sumidero,
                placeName = R.string.sumidero,
                placeTranslate = R.string.trans_sumidero,
                placeSnippet = R.string.founded_sumidero,
                placeDescription1 = R.string.desc1_sumidero,
                placeDescription2 = R.string.desc2_sumidero,
                placeDescription3 = R.string.desc3_sumidero,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_sumidero
            ),
            Place(
                placeId = 3,
                placeImage = R.drawable.img_agua_azul,
                placeName = R.string.agua_azul,
                placeTranslate = R.string.trans_agua_azul,
                placeSnippet = R.string.founded_agua_azul,
                placeDescription1 = R.string.desc1_agua_azul,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_agua_azul
            ),
            Place(
                placeId = 4,
                placeImage = R.drawable.img_misol_ha,
                placeName = R.string.misol_ha,
                placeTranslate = R.string.trans_misol_ha,
                placeSnippet = R.string.founded_misol_ha,
                placeDescription1 = R.string.desc1_misol_ha,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_misol_ha
            ),
            Place(
                placeId = 5,
                placeImage = R.drawable.img_tule,
                placeName = R.string.tule,
                placeTranslate = R.string.trans_tule,
                placeSnippet = R.string.founded_tule,
                placeDescription1 = R.string.desc1_tule,
                placeDescription2 = R.string.desc2_tule,
                placeDescription3 = R.string.desc3_tule,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_tule
            ),
            Place(
                placeId = 6,
                placeImage = R.drawable.img_cacahuamilpa,
                placeName = R.string.cacahuamilpa,
                placeTranslate = R.string.trans_cacahuamilpa,
                placeSnippet = R.string.founded_cacahuamilpa,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_cacahuamilpa
            ),
            Place(
                placeId = 7,
                placeImage = R.drawable.img_eyipantla,
                placeName = R.string.eyipantla,
                placeTranslate = R.string.trans_eyipantla,
                placeSnippet = R.string.founded_eyipantla,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_eyipantla
            ),
            Place(
                placeId = 8,
                placeImage = R.drawable.img_hierve_el_agua,
                placeName = R.string.hierve_el_agua,
                placeTranslate = R.string.trans_hierve_el_agua,
                placeSnippet = R.string.founded_hierve_el_agua,
                placeDescription1 = R.string.dummy_text,
                placeType = PlaceType.NATURE,
                placeWeather = R.string.weather_hierve_el_agua
            ),
        )
    }
}