package com.mahmoudalim.composepoctask.ui.compose


import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudalim.composepoctask.R
import com.mahmoudalim.data.enums.AuthorType
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.compose.AppGradientButton
import com.mahmoudalim.presentation.compose.AppProfileImage
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.presentation.theme.color.AppColor
import com.mahmoudalim.presentation.theme.color.AppColor.ButtonGradiantEndColor
import com.mahmoudalim.presentation.theme.color.AppColor.ButtonGradiantStartColor
import com.mahmoudalim.presentation.theme.color.AppColor.ButtonTextColor

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@Composable
fun PostFooterView(post: ResponseItem) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        PostFooterDescriptionView(post)
        PostFooterStatisticsView(post)
    }

}

@Composable
fun PostFooterDescriptionView(post: ResponseItem) {
    Row() {
        AppProfileImage(post.post.postFooter.image)

        Spacer(modifier = Modifier.width(10.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                post.post.postFooter.title,
                fontSize = 16.sp,
                color = AppColor.AppPrimaryFontColor,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold
            )

            Text(
                post.post.postFooter.category,
                fontSize = 14.sp,
                color = AppColor.AppPrimaryFontColor,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Light
            )
        }
    }
    if (post.post.author.authorType == AuthorType.RESTAURANT) {
        ViewMenuButton()
    }
}


@Composable
private fun ViewMenuButton() {
    val gradientBrush = Brush.linearGradient(
        colors = listOf(
            ButtonGradiantStartColor.copy(.35f),
            ButtonGradiantEndColor.copy(.35f)
        ),
        start = Offset(0f, Float.POSITIVE_INFINITY),
        end = Offset(Float.POSITIVE_INFINITY, 0f)
    )

    AppGradientButton(gradientBrush) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(R.string.view_menu),
            color = ButtonTextColor,
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            fontFamily = Montserrat
        )
    }
}





