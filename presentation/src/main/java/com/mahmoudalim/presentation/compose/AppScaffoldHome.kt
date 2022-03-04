package com.mahmoudalim.presentation.compose

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */
@ExperimentalMaterialApi
@Composable
fun AppScaffoldHome(Content: @Composable() () -> Unit) {
    val selectedItem = remember { mutableStateOf(1) }
    Scaffold(
        topBar = {
            AppTopBar()
        },
        content = {
            Content()
        },
        bottomBar = {
            AppBottomNavBar(selectedItem)
        },
        backgroundColor = Color.White,
    )
}


