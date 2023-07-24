package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class PlaceHospitalResponseDTO(
    @SerializedName("_id") val id: String,
    @SerializedName("address") val address: String,
    @SerializedName("geometry") val geometry: GeometryDTO,
    @SerializedName("name") val name: String,
    @SerializedName("opening_hours") val openingHour: OpeningHour,
    @SerializedName("place_id") val placeId: String,
    @SerializedName("rating") val rating: Float,
    @SerializedName("distance") val distance: Int,
    @SerializedName("types") val type: List<String>,
    @SerializedName("isEmergencyHospital") val isEmergencyHospital: Boolean,
)