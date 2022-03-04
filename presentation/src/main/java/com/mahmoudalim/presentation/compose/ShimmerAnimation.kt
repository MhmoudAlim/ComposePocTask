package com.mahmoudalim.presentation.compose

import androidx.compose.animation.core.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun shimmerAnimation(): Brush {
    val transition = rememberInfiniteTransition()
    val translateAnim by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(

            tween(durationMillis = 1200, easing = FastOutSlowInEasing),
            RepeatMode.Reverse
        )
    )
    val shimmerColorShades = listOf(
        AppColor.AppSkeletonBGColor.copy(0.8f),
        AppColor.AppSkeletonBGColor.copy(0.2f),
        AppColor.AppSkeletonBGColor.copy(0.8f),
    )

    return Brush.linearGradient(
        colors = shimmerColorShades,
        start = Offset(10f, 10f),
        end = Offset(translateAnim, translateAnim)
    )
}