package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import com.mahmoudalim.composepoctask.R
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.core.date.AppDate
import com.mahmoudalim.data.enums.AuthorType.*
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.compose.AppProfileImage
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@OptIn(ExperimentalCoilApi::class)
@Composable
fun PostHeader(post: ResponseItem) {
    Row(
        Modifier.padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        AppProfileImage(post.post.author.image)

        Spacer(modifier = Modifier.width(10.dp))

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            AuthorView(post)

            PostDateView(post)
        }
    }
}

@Composable
private fun AuthorView(post: ResponseItem) {
    Row(verticalAlignment = Alignment.CenterVertically) {

        Text(
            post.post.author.name,
            fontSize = 17.sp,
            color = AppColor.AppPrimaryFontColor,
            fontFamily = Montserrat,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.width(10.dp))

        val imageRes = when (post.post.author.authorType) {
            USER -> R.drawable.ic_person_name_icon
            RESTAURANT -> R.drawable.ic_rest_name_icon
        }
        Image(
            painter = painterResource(imageRes),
            post.post.author.name,
            Modifier
                .size(18.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = "menu", Modifier.clickable { }
        )
    }
}

@Composable
private fun PostDateView(post: ResponseItem) {
    val numberOfDays = AppDate.durationInDaysOf(
        post.post.statistics.createdAt
    )

    val date = if (numberOfDays > 1) "$numberOfDays days ago" else "$numberOfDays day ago"

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        if (post.post.author.authorType == USER) {
            Text(
                "Verified Buyer",
                fontSize = 15.sp,
                color = AppColor.AppPrimaryFontColor.copy(.5f),
                fontFamily = Montserrat
            )
            Text(
                ".",
                fontSize = 15.sp,
                color = AppColor.AppPrimaryFontColor.copy(.5f),
                fontFamily = Montserrat
            )
        }
        Text(
            date,
            fontSize = 15.sp,
            color = AppColor.AppPrimaryFontColor.copy(.5f)
        )
    }

}

