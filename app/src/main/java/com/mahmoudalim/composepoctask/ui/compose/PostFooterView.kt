package com.mahmoudalim.composepoctask.ui.compose


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoudalim.data.models.ResponseItem

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@Composable
fun PostFooterView(post: ResponseItem) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, start = 16.dp , end = 16.dp)
    ) {
        PostFooterDescriptionView(post)
        PostFooterStatisticsView(post)
        if (post.post.statistics.comments.isNotEmpty())
            PostFooterCommentsSectionView(post.post.statistics.comments)
    }

}





