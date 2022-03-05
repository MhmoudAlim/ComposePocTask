package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudalim.data.models.Comment
import com.mahmoudalim.presentation.compose.AppProfileImage
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.presentation.theme.color.AppColor
import com.mahmoudalim.presentation.theme.color.AppColor.AppCardBgColor
import com.mahmoudalim.composepoctask.R
import com.mahmoudalim.core.date.AppDate

/**
 * Created by Mahmoud Alim on 06/03/2022.
 */
@Composable
fun PostFooterCommentsSectionView(commentsList: List<Comment>) {
    Column(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .wrapContentHeight()
    ) {
        commentsList.forEach {
            CommentItem(it)
        }

    }
}

@Composable
fun CommentItem(comment: Comment) {
    Row(verticalAlignment = Alignment.Top) {
        AppProfileImage(comment.user.photo)

        Spacer(modifier = Modifier.width(10.dp))

        Column() {
            CommentItemCardDetailsView(comment)
            CommentFooterDetails(comment)
        }
    }
    Spacer(modifier = Modifier.height(12.dp))

}

@Composable
fun CommentFooterDetails(comment: Comment) {

    val numberOfDays = AppDate.durationInDaysOf(
        comment.createdAt
    )
    val date = if (numberOfDays > 1) "$numberOfDays days" else "$numberOfDays day"
    var likes by remember { mutableStateOf(comment.likes) }
    val textStyle =
        TextStyle(fontFamily = Montserrat, fontSize = 12.sp, color = AppColor.AppPrimaryFontColor)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(top = 2.dp, start = 8.dp)
    ) {
        Text(text = date, style = textStyle)
        Text(
            text = stringResource(id = R.string.like),
            modifier = Modifier.clickable { likes++ },
            style = textStyle
        )
        Text(text = "Reply", style = textStyle)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(text = "$likes", style = textStyle)
            Image(
                painter = painterResource(id = R.drawable.ic_comment_like),
                contentDescription = stringResource(
                    id = R.string.like
                )
            )
        }
    }
}

@Composable
private fun CommentItemCardDetailsView(comment: Comment) {
    Card(
        backgroundColor = AppCardBgColor.copy(0.5f),
        shape = RoundedCornerShape(14.dp),
        elevation = 0.dp,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = 12.dp, end = 18.dp, top = 8.dp, bottom = 8.dp)

        ) {
            Text(
                comment.user.userName,
                fontSize = 14.sp,
                color = AppColor.AppPrimaryFontColor,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold
            )

            Text(
                comment.description,
                fontSize = 12.sp,
                color = AppColor.AppPrimaryFontColor,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Light
            )
        }
    }
}