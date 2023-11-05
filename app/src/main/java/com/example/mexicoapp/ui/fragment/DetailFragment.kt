package com.example.mexicoapp.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Html
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import coil.load
import com.example.mexicoapp.R
import com.example.mexicoapp.databinding.FragmentDetailBinding
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

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModel by activityViewModels()

    private var isAllFabVisible: Boolean? = null

    private var place: String = "warsaw"

    private lateinit var swipeRefreshLayout: SwipeRefreshLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetailBinding.bind(view)

        swipeRefreshLayout = binding.refreshLayout

        viewModel.currentPlace.observe(this.viewLifecycleOwner) { it ->
            binding.detailIv.load(it.placeImage)
            binding.detailTitleTv.text = getString(it.placeName)
            binding.detailDescriptionTv.text = getString(it.placeDescription1)

            binding.historyFab.visibility = View.GONE
            binding.curiositiesFab.visibility = View.GONE
            isAllFabVisible = false

            val overview = getString(it.placeDescription1)
            binding.addFab.setOnClickListener {
                if (!isAllFabVisible!!) {
                    binding.historyFab.show()
                    //binding.historyFab.backgroundTintList = ColorStateList.valueOf(Color.RED)
                    binding.curiositiesFab.show()
                    binding.addFab.setImageResource(R.drawable.twotone_nature_24)

                    true
                } else {
                    binding.historyFab.hide()
                    binding.curiositiesFab.hide()
                    binding.addFab.setImageResource(R.drawable.twotone_add_24)

                    val styledText: Spanned = Html.fromHtml(overview, FROM_HTML_MODE_LEGACY)
                    binding.detailDescriptionTv.text = styledText

                    false
                }.also { isAllFabVisible = it }
            }

            val history = getString(it.placeDescription2)
            binding.historyFab.setOnClickListener {
                val styledText: Spanned = Html.fromHtml(history, FROM_HTML_MODE_LEGACY)
                binding.detailDescriptionTv.text = styledText
            }

            val curiosity = getString(it.placeDescription3)
            binding.curiositiesFab.setOnClickListener {
                val styledText: Spanned = Html.fromHtml(curiosity, FROM_HTML_MODE_LEGACY)
                binding.detailDescriptionTv.text = styledText
            }

            place = getString(it.placeWeather)
            getCurrentWeather(place)

            swipeRefreshLayout.setOnRefreshListener {
                getCurrentWeather(place)
                swipeRefreshLayout.isRefreshing = false
            }

            binding.btnTemp.setOnClickListener {
                findNavController().navigate(R.id.action_detailFragment_to_weatherFragment)
            }
        }
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

                    binding.btnTemp.text = "${data.main.temp.toInt()} °C"
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

