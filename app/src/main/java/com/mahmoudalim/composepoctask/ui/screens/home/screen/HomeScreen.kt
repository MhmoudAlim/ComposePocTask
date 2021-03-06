package com.mahmoudalim.composepoctask.ui.screens.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.mahmoudalim.composepoctask.ui.compose.PostItem
import com.mahmoudalim.composepoctask.ui.screens.home.vm.HomeScreenViewModel
import com.mahmoudalim.presentation.compose.AppSearchBar
import com.mahmoudalim.data.models.Response
import com.mahmoudalim.presentation.dimensions.LocalSpacing
import com.mahmoudalim.presentation.theme.color.AppColor

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun HomeScreen(vm: HomeScreenViewModel) {
    LaunchedEffect(key1 = true) {
        vm.loadNewsFeedData()
    }

    if (vm.response != null) {
        HomeScreenContent(vm.response!!)
    }
}

@Composable
private fun HomeScreenContent(response: Response) {
    val spacing = LocalSpacing.current

    Column(Modifier.fillMaxSize()) {
        AppSearchBar()
        LazyColumn(
            contentPadding = PaddingValues(bottom = spacing.spaceExtraLarge),
            modifier = Modifier
                .background(AppColor.AppGrayBGColor.copy(0.5f))
                .padding(top = spacing.spaceExtraSmall)
        ) {
            items(response) {
                PostItem(it)
            }
        }
    }

}