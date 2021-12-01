package com.example.retrofit

import com.google.gson.annotations.SerializedName

data class Resprr(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("precipitation")
	val precipitation: Precipitation? = null,

	@field:SerializedName("main")
	val main: Main? = null,

	@field:SerializedName("clouds")
	val clouds: Clouds? = null,

	@field:SerializedName("wind")
	val wind: Wind? = null
)

data class Main(

	@field:SerializedName("temp")
	val temp: Double? = null,

	@field:SerializedName("dew_point")
	val dewPoint: Double? = null,

	@field:SerializedName("grnd_pressure")
	val grndPressure: Double? = null,

	@field:SerializedName("humidity")
	val humidity: Double? = null,

	@field:SerializedName("pressure")
	val pressure: Double? = null
)

data class Wind(

	@field:SerializedName("deg")
	val deg: Double? = null,

	@field:SerializedName("speed")
	val speed: Double? = null
)

data class Precipitation(

	@field:SerializedName("convective")
	val convective: Int? = null,

	@field:SerializedName("fr_rain")
	val frRain: Int? = null,

	@field:SerializedName("rate")
	val rate: Int? = null,

	@field:SerializedName("ice")
	val ice: Int? = null,

	@field:SerializedName("accumulated")
	val accumulated: Int? = null
)

data class Clouds(

	@field:SerializedName("all")
	val all: Int? = null
)
