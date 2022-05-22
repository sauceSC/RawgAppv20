package com.example.rawgappv20

import android.app.Application
import com.example.rawgappv20.main.di.MainModule
import com.example.rawgappv20.main.main.CommonModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        setupKoin()
    }

    private fun setupKoin(){
        startKoin {
            androidContext(this@App)
            modules(
                CommonModule.createRetrofit(),
                MainModule.create()
            )

        }
    }
}