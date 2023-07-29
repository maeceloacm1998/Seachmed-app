package com.searchmed.core.network.database

import com.searchmed.core.network.models.Address
import com.searchmed.core.network.models.AutoCompleteAddressResponseDTO
import com.searchmed.core.network.models.HospitalDetailsResponseDTO
import com.searchmed.core.network.models.PlaceHospitalResponseDTO
import com.searchmed.core.network.models.ResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface PlaceApi {
    @POST("place/hospital/search")
    suspend fun getHospital(@Body address: Address): Response<ResponseModel<List<PlaceHospitalResponseDTO>>>

    @POST("place/autocomplete")
    suspend fun autoCompleteAddress(
        @Body address: Address
    ): Response<List<AutoCompleteAddressResponseDTO>>

    @POST("place/hospital/details")
    suspend fun getHospitalDetail(
        @Query(value = "placeid", encoded = true) placeId: String
    ): Response<ResponseModel<HospitalDetailsResponseDTO>>
}