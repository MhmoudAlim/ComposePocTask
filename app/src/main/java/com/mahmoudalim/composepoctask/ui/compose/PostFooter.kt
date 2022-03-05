package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoudalim.data.models.ResponseItem

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

@Composable
fun PostFooter(post: ResponseItem) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "${post.post.statistics.likesNumbers}")
        Text(text = "${post.post.statistics.commentsNumbers}")
        Text(text = "${post.post.statistics.sharesNumbers}")
    }
}
