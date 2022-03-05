package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.mahmoudalim.composepoctask.R
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@Composable
fun PostFooterStatisticsView(post: ResponseItem) {
    Box(modifier = Modifier.padding(vertical = 8.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Divider(color = AppColor.DividerColor, thickness = 0.8.dp)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.5.dp, bottom = 8.5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                LikesView(post.post.statistics.likesNumbers)
                CommentsView(post.post.statistics.commentsNumbers)
                SharesView(post.post.statistics.sharesNumbers)
            }
            if (post.post.statistics.comments.isNotEmpty())
                Divider(color = AppColor.DividerColor, thickness = 0.8.dp)
        }
    }
}

@Composable
private fun LikesView(likes: Int) {
    var likesNumbers by remember { mutableStateOf(likes) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { likesNumbers++ }) {
        Text(text = "$likesNumbers", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_likes),
            contentDescription = stringResource(
                R.string.like
            )
        )
    }
}

@Composable
private fun CommentsView(commentsNumbers: Int) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable { }) {
        Text(text = "$commentsNumbers", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_comments),
            contentDescription = stringResource(
                R.string.comment
            )
        )
    }
}

@Composable
private fun SharesView(sharesNumbers: Int) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable { }) {
        Text(text = "$sharesNumbers", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_shares),
            contentDescription = stringResource(
                R.string.share
            )
        )
    }
}