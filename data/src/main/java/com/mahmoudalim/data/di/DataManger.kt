package com.mahmoudalim.data.di

import com.mahmoudalim.data.repo.FeedsRepo

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

open class DataManager(
    val feedsRepo: FeedsRepo
)