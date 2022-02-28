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

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersample.R
import com.example.recyclersample.data.model.Venues

class VenueListActivity : AppCompatActivity() {
    private val venueListViewModel by viewModels<VenueListViewModel> {
        VenueListViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Instantiates headerAdapter and flowersAdapter. Both adapters are added to concatAdapter.
        which displays the contents sequentially */
        val headerAdapter = HeaderAdapter()
        val venueAdapter = VenueAdapter()
        val concatAdapter = ConcatAdapter(headerAdapter, venueAdapter)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = concatAdapter

        venueListViewModel.venueLiveData.observe(this, {
            it?.venues.let {
                venueAdapter.submitList(it as MutableList<Venues>)
                headerAdapter.updateVenueCount(it.size)
            }
        })
        venueListViewModel.onCreate()
    }
}