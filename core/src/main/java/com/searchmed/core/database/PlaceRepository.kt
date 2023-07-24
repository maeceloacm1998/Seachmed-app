package com.searchmed.core.database

interface PlaceRepository {
    suspend fun getHospitals(): List<Weather>?
}