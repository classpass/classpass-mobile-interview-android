/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.recyclersample.venueList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersample.R
import com.example.recyclersample.data.model.Venues

class VenueAdapter() :
    ListAdapter<Venues, VenueAdapter.VenueViewHolder>(VenuesDiffCallback) {

    class VenueViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val flowerTextView: TextView = itemView.findViewById(R.id.item_text)
        private var currentVenue: Venues? = null

        /* Bind flower name and image. */
        fun bind(venue: Venues) {
            currentVenue = venue

            flowerTextView.text = venue.name
//            if (venue.image != null) {
//                flowerImageView.setImageResource(flower.image)
//            } else {
//                flowerImageView.setImageResource(R.drawable.rose)
//            }
        }
    }

    /* Creates and inflates view and return FlowerViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VenueViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.venue_item, parent, false)
        return VenueViewHolder(view)
    }

    /* Gets current flower and uses it to bind view. */
    override fun onBindViewHolder(holder: VenueViewHolder, position: Int) {
        val venue = getItem(position)
        holder.bind(venue)

    }
}

object VenuesDiffCallback : DiffUtil.ItemCallback<Venues>() {
    override fun areItemsTheSame(oldItem: Venues, newItem: Venues): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Venues, newItem: Venues): Boolean {
        return oldItem.id == newItem.id
    }
}