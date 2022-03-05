package com.mahmoudalim.presentation.compose

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudalim.presentation.R
import com.mahmoudalim.presentation.theme.Montserrat
import com.mahmoudalim.presentation.theme.color.AppColor


@Composable
fun AppSearchBar() {
    val userInput = remember { mutableStateOf("") }
    Box(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 13.dp, horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            UserImage()
            SearchBarTextView(userInput)
        }
    }
}

@Composable
private fun UserImage() = Image(
    painter = painterResource(id = R.drawable.user_pp),
    contentDescription = null,
    contentScale = ContentScale.Fit,
    modifier = Modifier
        .size(48.dp)
        .clip(CircleShape)
)

@Composable
private fun SearchBarTextView(searchQuery: MutableState<String>) {
    TextField(
        value = searchQuery.value,
        onValueChange = { searchQuery.value = it },
        Modifier
            .fillMaxWidth()
            .height(48.dp)
            .shadow(4.dp, CircleShape, clip = true)
            .wrapContentHeight(),
        placeholder = { PlaceHolder() },
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            backgroundColor = Color.White
        ),
        textStyle = TextStyle(Color.Black, fontSize = 12.sp)
    )
}

@Composable
private fun PlaceHolder() = Text(
    fontSize = 12.sp,
    text = stringResource(R.string.share_your_experience),
    color = AppColor.AppPrimaryFontColor.copy(.5f),
    fontFamily = Montserrat
)

