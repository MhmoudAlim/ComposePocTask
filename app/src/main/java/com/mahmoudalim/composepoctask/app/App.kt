package com.mahmoudalim.composepoctask.app

import android.app.Application
import com.mahmoudalim.composepoctask.di.injectAppModule
import com.mahmoudalim.data.di.injectDataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            injectModules()
            androidLogger()
        }
    }

    private fun injectModules() {
        injectDataModule()
        injectAppModule()
    }

}