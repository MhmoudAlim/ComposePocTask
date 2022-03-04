package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun SkeletonCardItemView(brush: Brush) {

    Column(Modifier.padding(bottom = 4.dp).background(Color.White)) {
        SkeletonAuthorView(brush)

        Box(
            Modifier
                .fillMaxWidth()
                .height(192.dp)
                .background(brush)
        )

        SkeletonedCardFooterView()
    }

}

