package com.mahmoudalim.composepoctask.ui.screens

import androidx.compose.runtime.Composable
import com.mahmoudalim.core.navigation.Route
import com.mahmoudalim.core.navigation.UiEvent
import com.mahmoudalim.presentation.compose.ShimmerSkeletonView

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun SkeletonScreen(
    onNavigate: (UiEvent.Navigate) -> Unit
) {
    ShimmerSkeletonView()

    //TODO: add delay logic here after creating vm
    onNavigate(UiEvent.Navigate(Route.HOME))
}