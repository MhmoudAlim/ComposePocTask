package com.mahmoudalim.composepoctask.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mahmoudalim.data.enums.PostType.NESTED
import com.mahmoudalim.data.enums.PostType.SINGLE
import com.mahmoudalim.data.models.ResponseItem
import com.mahmoudalim.presentation.dimensions.LocalSpacing

@Composable
fun PostItem(post: ResponseItem) {
    when (post.post.postType) {
        SINGLE -> {
            SinglePostItemView(post)
        }
        NESTED -> {
            NestedPostItemView(post)
        }
    }
}

@Composable
private fun SinglePostItemView(post: ResponseItem) {
    val spacing = LocalSpacing.current

    Column(
        Modifier
            .padding(bottom = spacing.spaceExtraSmall)
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        PostHeader(post)
        PostContent(post)
        PostFooterView(post)
    }
}

@Composable
fun NestedPostItemView(post: ResponseItem) {
    Column(
        Modifier
            .padding(bottom = 4.dp)
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        NestedPostWrapperView(post) {
            SinglePostItemView(it)
        }
    }
}







