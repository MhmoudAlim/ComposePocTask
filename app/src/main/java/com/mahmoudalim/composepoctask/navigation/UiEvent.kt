package com.mahmoudalim.composepoctask.navigation

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
}
