package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.mahmoudalim.presentation.shapes.AppSkeletonedTextView


@Composable
fun SkeletonAuthorView(brush: Brush) {
    Row(
        Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {

        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(brush)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column() {

            AppSkeletonedTextView(width = 119.dp, height = 10.dp)

            Spacer(modifier = Modifier.height(10.dp))

            AppSkeletonedTextView(width = 64.dp, height = 6.dp)

        }
    }
}