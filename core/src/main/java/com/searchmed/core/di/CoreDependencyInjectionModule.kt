package com.searchmed.core.di

import com.searchmed.core.database.AuthInterceptor
import com.searchmed.core.database.PlaceRepository
import com.searchmed.core.database.PlaceRepositoryImpl
import com.searchmed.core.database.WeatherApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CoreDependencyInjectionModule {
    val modules = arrayOf(module {
//        factory { AuthInterceptor() }
        factory { provideOkHttpClient() }
        single { provideRetrofit(get()) }
        factory { provideForecastApi(get()) }
        factory<PlaceRepository> { PlaceRepositoryImpl(get()) }
    })

    private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl("https://searchmed.onrender.com/").client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    private fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder().build()
    }

    private fun provideForecastApi(retrofit: Retrofit) = retrofit.create(WeatherApi::class.java)

}