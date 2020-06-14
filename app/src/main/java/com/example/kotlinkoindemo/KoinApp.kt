package com.example.kotlinkoindemo

import android.app.Application
import com.example.kotlinkoindemo.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by gauravgoel on 14/June/2020
 */
class KoinApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val moduleList = listOf(mainModule)

        // start Koin
        startKoin {
            androidLogger()
            // declare used Android context
            androidContext(this@KoinApp)
            // declare modules
            modules(moduleList)
        }
    }
}