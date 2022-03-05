package com.mahmoudalim.data.di

import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

fun injectDataModule() = loadModule

private val loadModule by lazy {
    loadKoinModules(
        listOf(
            dataManagerModule,
            )
    )
    reposModules
}

private val reposModules by lazy {
    loadKoinModules(
        feedsModule,
    )
}


val dataManagerModule = module {

    single {
        DataManager(
            get(),
        )
    }
}