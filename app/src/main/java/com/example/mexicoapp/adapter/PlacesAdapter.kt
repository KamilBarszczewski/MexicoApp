package com.example.mexicoapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.mexicoapp.databinding.ItemRowBinding
import com.example.mexicoapp.model.Place

class PlacesAdapter (private val onItemClicked: (Place) -> Unit
) : ListAdapter<Place, PlacesAdapter.ViewHolder>(DiffCallback) {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context

        return ViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = getItem(position)
        holder.itemView.setOnClickListener {
            onItemClicked(current)
        }
        holder.bind(current, context)
    }

    class ViewHolder(private var binding: ItemRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(place: Place, context: Context) {
            binding.apply {
                imageView.load(place.placeImage)
                titleTv.text = context.getString(place.placeName)
                transTitleTv.text = context.getString(place.placeTranslate)
                snippetTv.text = context.getString(place.placeSnippet)
            }
        }
    }

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Place>() {
            override fun areItemsTheSame(oldItem: Place, newItem: Place): Boolean {
                return (oldItem.placeId == newItem.placeId ||
                        oldItem.placeName == newItem.placeName ||
                        oldItem.placeType == newItem.placeType)
            }

            override fun areContentsTheSame(oldItem: Place, newItem: Place): Boolean {
                return oldItem == newItem
            }

        }
    }
}

