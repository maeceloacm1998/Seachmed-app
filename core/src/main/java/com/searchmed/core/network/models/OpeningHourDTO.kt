package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class OpeningHour(
    @SerializedName("open_now") val openNow: Boolean,
)