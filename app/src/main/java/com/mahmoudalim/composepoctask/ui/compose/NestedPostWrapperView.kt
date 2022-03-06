package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 06/03/2022.
 */
@Composable
fun NestedPostWrapperView(
    post: ResponseItem,
    NestedPostView: @Composable() (post: ResponseItem) -> Unit
) {
    PostHeader(post)

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
        Card(
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, color = AppColor.BoxBorderColor)
        ) {
            NestedPostView(post)
        }
    }
}