package com.searchmed.core.network.di

import com.searchmed.core.network.database.PlaceApi
import com.searchmed.core.network.repository.PlaceRepository
import com.searchmed.core.network.repository.PlaceRepositoryImpl
import org.koin.dsl.module
import retrofit2.Retrofit

object NetworkDependencyInjectionModule {
    val modules = arrayOf(module {
        factory { providePlaceApi(get()) }

        factory<PlaceRepository> { PlaceRepositoryImpl(get()) }
    })

    private fun providePlaceApi(retrofit: Retrofit) = retrofit.create(PlaceApi::class.java)
}