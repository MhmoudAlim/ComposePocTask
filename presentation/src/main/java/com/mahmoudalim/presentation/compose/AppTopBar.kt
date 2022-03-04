package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.BadgeBox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoudalim.presentation.R

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppTopBar() {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = AppBarDefaults.TopAppBarElevation,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                "Logo"
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(28.dp),
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_search),
                    "Search",
                    modifier = Modifier.clickable { }

                )
                //TODO: refactor using constraint layout and custom badge icon instead
                NotificationIcon()

                ShoppingCardIcon()
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
private fun ShoppingCardIcon() {
    var cardSelected by remember { mutableStateOf(false) }
    if (!cardSelected) {
        BadgeBox(
            badgeContent = {},
            modifier = Modifier.clickable { cardSelected = true }
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_shopping_card),
                "Shopping Card",
            )
        }
    } else {
        Image(
            painter = painterResource(id = R.drawable.ic_shopping_card),
            "Shopping Card",
        )
    }
}

@ExperimentalMaterialApi
@Composable
private fun NotificationIcon() {
    var notificationSelected by remember { mutableStateOf(false) }
    if (!notificationSelected) {
        BadgeBox(
            badgeContent = {},
            modifier = Modifier.clickable { notificationSelected = true }
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_notifications),
                "Notifications",
            )
        }
    } else {
        Image(
            painter = painterResource(id = R.drawable.ic_notifications),
            "Notifications",
        )
    }
}