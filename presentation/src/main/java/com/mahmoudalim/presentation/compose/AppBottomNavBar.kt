package com.mahmoudalim.presentation.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoudalim.presentation.R

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun AppBottomNavBar(selectedItem: MutableState<Int>) {
    BottomAppBar(
        backgroundColor = Color.White,
        elevation = 8.dp,
        contentPadding = PaddingValues(0.dp),
        content = {
            BottomNavigation(backgroundColor = Color.White) {
                for (item in BottomNavBarItem.items) {
                    BottomNavigationItem(
                        selected = selectedItem.value == item.id,
                        onClick = {
                            selectedItem.value = item.id
                        },
                        icon = {
                            Image(
                                painter = painterResource(id = item.icon),
                                contentDescription = item.title
                            )
                        },
                        alwaysShowLabel = false,
                    )
                }
            }
        },
    )
}


data class BottomNavBarItem(val id: Int, val icon: Int, val title: String) {
    companion object {
        val items = listOf(
            BottomNavBarItem(1, R.drawable.ic_home, "Home"),
            BottomNavBarItem(2, R.drawable.ic_fork, "Restaurants"),
            BottomNavBarItem(3, R.drawable.ic_discount, "Offers"),
            BottomNavBarItem(4, R.drawable.ic_group, "Groups"),
            BottomNavBarItem(5, R.drawable.ic_single, "Profile")
        )
    }
}

