package com.tote.demo.examplemoduleproject

import android.app.Application
import com.tote.demo.data.di.dataModule
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(dataModule)
        }
    }

}
