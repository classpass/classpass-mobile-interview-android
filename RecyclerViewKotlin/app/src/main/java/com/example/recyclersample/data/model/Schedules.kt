package com.example.recyclersample.data.model

import com.google.gson.annotations.SerializedName
/*
Copyright (c) 2022 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Schedules (

	@SerializedName("id") val id : Long,
	@SerializedName("starttime") val starttime : Int,
	@SerializedName("endtime") val endtime : Int,
	@SerializedName("availability") val availability : Availability,
	@SerializedName("teacher") val teacher : Teacher,
	@SerializedName("display_duration") val display_duration : String,
	@SerializedName("duration_minutes") val duration_minutes : Int,
	@SerializedName("teacher_name") val teacher_name : String,
	@SerializedName("cancellation_policy") val cancellation_policy : String,
	@SerializedName("late_cancellation") val late_cancellation : String,
	@SerializedName("org_visits_including_plus") val org_visits_including_plus : Int,
	@SerializedName("tag_ids") val tag_ids : List<String>,
	@SerializedName("venue_store_ad_unit") val venue_store_ad_unit : Venue_store_ad_unit,
	@SerializedName("is_livestream") val is_livestream : Boolean,
	@SerializedName("location_override") val location_override : Boolean,
	@SerializedName("verticals") val verticals : List<String>
)