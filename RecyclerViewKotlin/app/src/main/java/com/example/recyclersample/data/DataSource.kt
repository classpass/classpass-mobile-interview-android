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

package com.example.recyclersample.data

import android.content.res.Resources
import androidx.lifecycle.MutableLiveData
import com.example.recyclersample.R
import com.example.recyclersample.data.model.AttendingFriend
import com.example.recyclersample.data.model.NestedSearch
import com.google.gson.Gson
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import java.io.BufferedInputStream
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class DataSource(resources: Resources) {
    val nestedSearchLiveData = MutableLiveData(
        NestedSearch(
            venues = mutableListOf(),
            search_id = 0,
            radius_used = null,
            schedule_context = null
        )
    )
    private val fakeNestedSearch: NestedSearch

    init {
        val bufferedInputStream = BufferedInputStream(resources.openRawResource(R.raw.venue_data))
        fakeNestedSearch = Gson().fromJson(bufferedInputStream.reader(), NestedSearch::class.java)
        bufferedInputStream.close()
    }

    fun fetchSearchResults() {
        Single
            .just(fakeNestedSearch)
            .delay(Random.nextLong() % 5, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({
                nestedSearchLiveData.value = it
            }, {
                it.printStackTrace()
            })
    }

    fun fetchAttendingFriends() {
        Single.just(FAKE_FRIENDS_ATTENDING)
            .delay(Random.nextLong() % 5, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({

            }, {

            })
    }

    companion object {
        private var INSTANCE: DataSource? = null
        val FAKE_FRIENDS_ATTENDING =  listOf(
            AttendingFriend(
                name = "John Snow",
                scheduleId = 224360915L
            )
        )

        fun getDataSource(resources: Resources): DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }
}