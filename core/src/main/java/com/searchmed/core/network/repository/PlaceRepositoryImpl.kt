package com.searchmed.core.network.repository

import com.searchmed.core.network.database.PlaceApi
import com.searchmed.core.network.models.Address
import com.searchmed.core.network.models.AutoCompleteAddressResponseDTO
import com.searchmed.core.network.models.PlaceHospitalResponseDTO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PlaceRepositoryImpl(private val placeApi: PlaceApi) : PlaceRepository {
    override suspend fun getHospitals(address: String): List<PlaceHospitalResponseDTO>? {
        val res = withContext(Dispatchers.IO) {
            placeApi.getHospital(Address(address))
        }
        return res.body()?.result
    }

    override suspend fun autoCompleteAddress(address: String): List<AutoCompleteAddressResponseDTO>? {
        val res = withContext(Dispatchers.IO) {
            placeApi.autoCompleteAddress(Address(address))
        }
        return res.body()
    }
}