package com.mahmoudalim.composepoctask.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.mahmoudalim.composepoctask.navigation.Route
import com.mahmoudalim.composepoctask.navigation.UiEvent
import com.mahmoudalim.presentation.compose.ShimmerSkeletonView
import kotlinx.coroutines.delay
import java.util.concurrent.TimeUnit

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun SkeletonScreen(
    onNavigate: (UiEvent.Navigate) -> Unit
) {

    ShimmerSkeletonView()

    LaunchedEffect(key1 = true) {
        delay(
            TimeUnit.SECONDS.toMillis(1)
        )

        onNavigate(UiEvent.Navigate(Route.HOME))
    }
}