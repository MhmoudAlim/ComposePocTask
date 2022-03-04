package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun ShimmerSkeletonView() {
    val brush = shimmerAnimation()

    LazyColumn(Modifier.background(AppColor.AppGrayBGColor.copy(0.5f))) {
        items(4){
            SkeletonCardItemView(brush)
        }
    }
}


