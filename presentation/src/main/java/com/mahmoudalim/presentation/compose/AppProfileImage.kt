package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.mahmoudalim.core.util.ImageResource

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */


@OptIn(ExperimentalCoilApi::class)
@Composable
fun AppProfileImage(
    imageName: String
) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
    ) {
        val imageRes = ImageResource.getIdentifier(context, imageName)
        Image(
            painter = rememberImagePainter(imageRes),
            imageName,
            Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit
        )
    }
}