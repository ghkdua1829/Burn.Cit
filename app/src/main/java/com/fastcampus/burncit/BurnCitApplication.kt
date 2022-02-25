package com.fastcampus.burncit

import android.app.Application
import com.fastcampus.burncit.di.exerciseDaoAppModule
import com.fastcampus.burncit.di.repositoryAppModule
import com.fastcampus.burncit.di.viewModelAppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BurnCitApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BurnCitApplication)
            modules(
                listOf(
                    repositoryAppModule, viewModelAppModule, exerciseDaoAppModule
                )
            )
        }
    }
}