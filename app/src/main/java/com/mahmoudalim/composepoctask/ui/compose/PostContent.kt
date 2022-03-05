package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.mahmoudalim.core.util.ImageResource
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@OptIn(ExperimentalCoilApi::class)
@Composable
fun PostContent(
    post: ResponseItem
) {
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        val textStyle =
            TextStyle(
                fontSize = 14.sp,
                color = AppColor.AppPrimaryFontColor,
                fontFamily = Montserrat
            )
        Text(
            text = post.post.postDescription,
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            style = textStyle
        )
        Box(
            modifier = Modifier
                .height(200.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            val imageRes = ImageResource.getIdentifier(context, post.post.postImages.component1())

            //TODO: Use LazyVerticalGrid to display all photos in case of multiple post photos
            Image(
                painter = rememberImagePainter(imageRes),
                post.post.type,
                Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.FillBounds
            )
        }
    }
}