package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by Mahmoud Alim on 06/03/2022.
 */

@Composable
fun AppGradientButton(gradientBrush: Brush, TextView: @Composable() () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(top = 10.dp)
    ) {
        Button(
            shape = CircleShape,
            onClick = {},
            modifier = Modifier
                .fillMaxSize()
                .background(shape = CircleShape, brush = gradientBrush),
            elevation = ButtonDefaults.elevation(0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.Transparent
            )
        ) {
            TextView()
        }
    }
}
