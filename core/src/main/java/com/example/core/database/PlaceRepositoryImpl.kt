package com.example.core.database

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PlaceRepositoryImpl(private val placeApi: WeatherApi) : PlaceRepository {
    override suspend fun getHospitals(): List<Weather>? {
        val res = withContext(Dispatchers.IO) {
            placeApi.getHospital(Address("rua hildebrando de oliveira,235"))
        }
        return res.body()?.result
    }
}