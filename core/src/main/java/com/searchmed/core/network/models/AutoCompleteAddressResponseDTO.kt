package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class AutoCompleteAddressResponseDTO (
    @SerializedName("id") val id: String,
    @SerializedName("address") val address: String,
)