package com.searchmed.core.network.models

import com.google.gson.annotations.SerializedName

data class ResponseModel<T>(
        @SerializedName("status")
        val status: String,

        @SerializedName("result")
        val result: T,
)