package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class GeometryDTO(
    @SerializedName("location") val location: LatLongLiteralDTO,
)