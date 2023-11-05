package com.example.mexicoapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.mexicoapp.R
import com.example.mexicoapp.adapter.PlacesAdapter
import com.example.mexicoapp.databinding.FragmentLayoutBinding
import com.example.mexicoapp.ui.viewmodel.ViewModel

class ArchZoneFragment : Fragment() {

    private var _binding: FragmentLayoutBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLayoutBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLayoutBinding.bind(view)

        val adapter = PlacesAdapter {
            viewModel.updateCurrentPlace(it)
            findNavController()
                .navigate(R.id.action_navigation_archZone_to_detailFragment)
        }
        binding.recyclerView.adapter = adapter
        adapter.submitList(viewModel.archZoneData)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

