package com.searchmed.core.network.database

import com.searchmed.core.network.models.Address
import com.searchmed.core.network.models.AutoCompleteAddressResponseDTO
import com.searchmed.core.network.models.PlaceHospitalResponseDTO
import com.searchmed.core.network.models.ResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PlaceApi {
    @POST("place/hospital/search")
    suspend fun getHospital(@Body address: Address): Response<ResponseModel<PlaceHospitalResponseDTO>>

    @POST("place/autocomplete")
    suspend fun autoCompleteAddress(
        @Body address: Address
    ): Response<List<AutoCompleteAddressResponseDTO>>
}