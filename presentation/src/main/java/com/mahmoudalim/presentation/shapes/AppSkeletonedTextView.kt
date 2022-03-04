package com.mahmoudalim.presentation.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mahmoudalim.presentation.compose.shimmerAnimation

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun AppSkeletonedTextView(width: Dp, height: Dp, corners: Dp = 4.dp) {
    val brush = shimmerAnimation()
    Box(
        modifier = Modifier
            .height(height)
            .width(width)
            .background(
                shape = RoundedCornerShape(corners),
                brush = brush,
            )
    )
}