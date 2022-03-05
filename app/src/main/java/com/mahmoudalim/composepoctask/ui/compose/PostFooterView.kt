package com.mahmoudalim.composepoctask.ui.compose


import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudalim.data.enums.AuthorType
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.compose.AppProfileImage
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@Composable
fun PostFooterView(post: ResponseItem) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        PostFooterTypeView(post)
        PostFooterStatistics(post)
    }

}

@Composable
fun PostFooterTypeView(post: ResponseItem) {
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
    if(post.post.author.authorType == AuthorType.RESTAURANT){
        Button(onClick = { /*TODO*/ }) {

        }
    }

}

@Composable
private fun PostFooterStatistics(post: ResponseItem) {
    Row(
        Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "${post.post.statistics.likesNumbers}")
        Text(text = "${post.post.statistics.commentsNumbers}")
        Text(text = "${post.post.statistics.sharesNumbers}")
    }
}
