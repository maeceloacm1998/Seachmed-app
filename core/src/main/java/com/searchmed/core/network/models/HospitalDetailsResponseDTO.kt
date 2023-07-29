package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class HospitalDetailsResponseDTO(
    @SerializedName("adrAddress") val address: String,
    @SerializedName("currentOpeningHours") val currentOpeningHours: CurrentOpeningHoursDTO,
    @SerializedName("formatted_address") val formattedAddress: String,
    @SerializedName("formatted_phone_number") val phoneNumber: String,
    @SerializedName("geometry") val geometry: GeometryDTO,
    @SerializedName("place_id") val placeId: String,
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
    @SerializedName("types") val type: List<String>,
)