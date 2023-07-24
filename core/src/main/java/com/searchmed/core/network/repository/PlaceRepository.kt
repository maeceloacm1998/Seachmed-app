package com.searchmed.core.network.repository

import com.searchmed.core.network.models.AutoCompleteAddressResponseDTO
import com.searchmed.core.network.models.PlaceHospitalResponseDTO

interface PlaceRepository {
    suspend fun getHospitals(address: String): List<PlaceHospitalResponseDTO>?
    suspend fun autoCompleteAddress(address: String): List<AutoCompleteAddressResponseDTO>?
    // TODO Fazer o modelo de resposta e testar se esta funcionando
    suspend fun getHospitalDetail(placeId: String)
}