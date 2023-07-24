package com.example.core.database

interface PlaceRepository {
    suspend fun getHospitals(): List<Weather>?
}