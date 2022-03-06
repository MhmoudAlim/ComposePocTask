package com.mahmoudalim.composepoctask.di

import com.mahmoudalim.composepoctask.ui.screens.home.vm.mainViewModel
import org.koin.core.context.loadKoinModules

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

fun injectAppModule() = loadModule


private val loadModule by lazy {
    loadKoinModules(
        listOf(
            mainViewModel
        )
    )
}