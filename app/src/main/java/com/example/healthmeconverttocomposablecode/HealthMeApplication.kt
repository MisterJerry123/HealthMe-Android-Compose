package com.example.healthmeconverttocomposablecode

import android.app.Application
import com.example.healthmeconverttocomposablecode.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HealthMeApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@HealthMeApplication)
            modules(
                viewModelModule,

            )

        }
    }
}