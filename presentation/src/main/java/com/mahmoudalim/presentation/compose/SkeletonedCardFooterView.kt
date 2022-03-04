package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoudalim.presentation.shapes.AppSkeletonedTextView

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */
@Composable
fun SkeletonedCardFooterView() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        AppSkeletonedTextView(width = 51.dp, height = 10.dp)
        AppSkeletonedTextView(width = 51.dp, height = 10.dp)
        AppSkeletonedTextView(width = 51.dp, height = 10.dp)
    }
}