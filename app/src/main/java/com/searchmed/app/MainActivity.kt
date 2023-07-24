package com.searchmed.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.searchmed.core.R
import com.searchmed.core.database.PlaceRepository
import com.searchmed.core.di.CoreDependencyInjectionModule
import com.searchmed.core.utils.KoinUtils
import com.searchmed.core.utils.KoinUtils.addModules
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val repository: PlaceRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin()
        lifecycleScope.launch {
           runCatching {
               repository.getHospitals()
           }.onFailure { 
               Log.e("ERROR", it.message.toString())
           }
        }
    }

    private fun startKoin() {
        KoinUtils.createInstance(applicationContext)

        addModules(*CoreDependencyInjectionModule.modules)
    }
}