package com.searchmed.core.network.di

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitDependencyInjectionModule {
    val modules = arrayOf(module {
//        factory { AuthInterceptor() }
        factory { provideOkHttpClient() }
        single { provideRetrofit(get()) }
    })

    private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl("https://searchmed.onrender.com/").client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    private fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder().build()
    }
}