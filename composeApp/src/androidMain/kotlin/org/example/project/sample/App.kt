package org.example.project.sample

import android.app.Application
import di.appModule
import org.example.project.sample.di.androidAppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App.applicationContext)
            modules(appModule(), androidAppModule())
        }
    }
}