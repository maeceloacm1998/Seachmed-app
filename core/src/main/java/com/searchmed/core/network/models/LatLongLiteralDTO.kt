package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class LatLongLiteralDTO(
    @SerializedName("lat") val lat: String,
    @SerializedName("lng") val long: String,
)