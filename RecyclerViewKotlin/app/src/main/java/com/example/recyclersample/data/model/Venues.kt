package com.example.recyclersample.data.model

import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2022 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Venues (

	@SerializedName("id") val id : Int,
	@SerializedName("tz") val tz : String,
	@SerializedName("images") val images : Images,
	@SerializedName("name") val name : String,
	@SerializedName("description") val description : String,
	@SerializedName("location") val location : Location,
	@SerializedName("source") val source : String,
	@SerializedName("ratings") val ratings : Ratings,
	@SerializedName("address") val address : Address,
	@SerializedName("alias") val alias : String,
	@SerializedName("amenities") val amenities : Amenities,
	@SerializedName("attended") val attended : Boolean,
	@SerializedName("booking_window") val booking_window : String,
	@SerializedName("cancellation_policy") val cancellation_policy : String,
	@SerializedName("facebook_page_url") val facebook_page_url : String,
	@SerializedName("twitter") val twitter : String,
	@SerializedName("instagram_handle") val instagram_handle : String,
	@SerializedName("how_to_get_there") val how_to_get_there : String,
	@SerializedName("is_new") val is_new : Boolean,
	@SerializedName("out_of_network") val out_of_network : Boolean,
	@SerializedName("late_cancellation") val late_cancellation : String,
	@SerializedName("lockers") val lockers : Boolean,
	@SerializedName("organization_id") val organization_id : Int,
	@SerializedName("phone_number") val phone_number : String,
	@SerializedName("pro_tip") val pro_tip : String,
	@SerializedName("requirements") val requirements : Requirements,
	@SerializedName("showers") val showers : Boolean,
	@SerializedName("subtitle") val subtitle : String,
	@SerializedName("transportation") val transportation : String,
	@SerializedName("website") val website : String,
	@SerializedName("what_to_bring") val what_to_bring : String,
	@SerializedName("when_to_arrive") val when_to_arrive : String,
	@SerializedName("distance") val distance : Double,
	@SerializedName("classes") val classes : List<Classes>,
	@SerializedName("has_strike_through_price") val has_strike_through_price : Boolean,
	@SerializedName("venue_store_ad_unit") val venue_store_ad_unit : Venue_store_ad_unit,
	@SerializedName("attributes") val attributes : Attributes
)