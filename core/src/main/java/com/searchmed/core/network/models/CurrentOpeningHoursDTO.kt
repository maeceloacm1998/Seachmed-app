package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class CurrentOpeningHoursDTO(
    @SerializedName("open_now") val openNow: Boolean,
    @SerializedName("weekday_text") val weekday: List<String>,
)
