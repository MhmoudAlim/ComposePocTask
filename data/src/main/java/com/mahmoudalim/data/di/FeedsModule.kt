package com.mahmoudalim.data.di

import com.mahmoudalim.data.data_source.FeedsLocalDataSrc
import com.mahmoudalim.data.repo.FeedsRepo
import com.mahmoudalim.core.util.JsonFileParser
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

val feedsModule = module {

    single {
        JsonFileParser
    }

    factory { FeedsLocalDataSrc(get() , androidApplication()) }
    factory { FeedsRepo(get()) }
}