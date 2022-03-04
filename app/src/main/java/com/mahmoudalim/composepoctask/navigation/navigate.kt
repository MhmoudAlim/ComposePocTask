package com.mahmoudalim.composepoctask.navigation

import androidx.navigation.NavController
import com.mahmoudalim.core.navigation.UiEvent

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}