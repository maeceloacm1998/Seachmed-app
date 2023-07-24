package com.searchmed.core.database

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface WeatherApi {
    @POST("place/hospital/search")
    suspend fun getHospital(@Body address: Address): Response<Res<Weather>>
}

data class Res<T>(
    @SerializedName("status")
    val status: String,

    @SerializedName("result")
    val result: List<T>,
)

data class Address(
    val address: String
)

data class Weather(
    @SerializedName("_id") val id: String,
    @SerializedName("address") val address: String,
    @SerializedName("geometry") val geometry: Geometry,
    @SerializedName("name") val name: String,
    @SerializedName("opening_hours") val openingHour: OpeningHour,
    @SerializedName("place_id") val placeId: String,
    @SerializedName("rating") val rating: Float,
    @SerializedName("distance") val distance: Int,
    @SerializedName("types") val type: List<String>,
    @SerializedName("isEmergencyHospital") val isEmergencyHospital: Boolean,
)

data class Geometry(
    @SerializedName("location") val location: LatLongLiteral,
)

data class LatLongLiteral(
    @SerializedName("lat") val lat: String,
    @SerializedName("lng") val long: String,
)

data class OpeningHour(
    @SerializedName("open_now") val openNow: Boolean,
)