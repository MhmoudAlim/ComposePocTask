package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mahmoudalim.data.models.ResponseItem

@Composable
fun PostItem(post: ResponseItem) {
    Box(
        Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Text(text = post.post.postDescription)
    }
}