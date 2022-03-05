package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mahmoudalim.data.models.ResponseItem

@Composable
fun PostItem(post: ResponseItem) {
    Column(
        Modifier
            .padding(bottom = 4.dp)
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        PostHeader(post)
        PostContent(post)
        PostFooter(post)
        Spacer(modifier = Modifier.height(12.dp))
    }
}