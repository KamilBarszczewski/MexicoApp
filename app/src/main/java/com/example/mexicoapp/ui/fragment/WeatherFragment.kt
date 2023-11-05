package com.example.mexicoapp.ui.fragment

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.ConfigurationCompat
import androidx.fragment.app.activityViewModels
import com.example.mexicoapp.R
import com.example.mexicoapp.databinding.FragmentWeatherBinding
import com.example.mexicoapp.ui.viewmodel.ViewModel
import com.example.mexicoapp.utils.RetrofitInstance
import com.squareup.picasso.Picasso
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException
import java.util.Date
import java.util.Locale

class WeatherFragment : Fragment() {

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ViewModel by activityViewModels()

    private var place: String = "warsaw"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWeatherBinding.bind(view)

        viewModel.currentPlace.observe(this.viewLifecycleOwner) { it ->
            place = getString(it.placeWeather)
            getCurrentWeather(place)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("SetTextI18n")
    @OptIn(DelicateCoroutinesApi::class)
    private fun getCurrentWeather(place: String) {
        GlobalScope.launch(Dispatchers.IO) {
            val response = try {
                RetrofitInstance.api.getCurrentWeather(
                    place,
                    "metric",
                    "pl",
                    requireContext().getString(R.string.api_key)
                )
            } catch (e: IOException) {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(requireContext(), "No network connection!", Toast.LENGTH_SHORT)
                        .show()
                }
                return@launch

            } catch (e: HttpException) {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(requireContext(), "http error ${e.message}", Toast.LENGTH_SHORT)
                        .show()
                }
                return@launch
            }

            if (response.isSuccessful && response.body() != null) {
                withContext(Dispatchers.Main) {
                    val data = response.body()!!
                    val imageIcon = data.weather[0].icon
                    val imgUrl = "https://openweathermap.org/img/w/$imageIcon.png"
                    Picasso.get().load(imgUrl).into(binding.imgWeather)

                    binding.apply {
                        tvTemp.text = "${data.main.temp.toInt()} °C"
                        tvLocation.text = "${data.name}\n${data.sys.country}"
                        tvStatus.text = data.weather[0].description
                        tvFeelsLike.text = "Feels like: ${data.main.feels_like} °C"
                        tvMinTemp.text = "Min temp: ${data.main.temp_min} °C"
                        tvMaxTemp.text = "Max temp: ${data.main.temp_max} °C"
                        tvHumidity.text = "${data.main.humidity}%"
                        tvPressure.text = "${data.main.pressure}hPa"
                        tvWind.text = "${data.wind.speed} KM/H"
                        tvUpdateTime.text =
                            "Last update: ${dateFormatConverter(data.dt.toLong() + data.timezone.toLong())}"
                        tvSunrise.text =
                            dateFormatConverter(data.sys.sunrise.toLong() + data.timezone.toLong())
                        tvSunset.text =
                            dateFormatConverter(data.sys.sunset.toLong() + data.timezone.toLong())
                    }
                }
            }
        }
    }

    private fun dateFormatConverter(date: Long): String {
        val currentLocale = ConfigurationCompat.getLocales(resources.configuration)[0]

        return SimpleDateFormat(
            "HH:mm",
            //currentLocale?.let { Locale.Builder().setLocale(it).build() }
            currentLocale?.let { Locale.getDefault() }
        ).format(Date(date * 1000 - (60 * 60 * 1000)))
    }
}