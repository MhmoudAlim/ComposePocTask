package com.mahmoudalim.composepoctask.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

@Composable
fun HomeScreen(){
    Box(Modifier.fillMaxSize()) {
        
        Text(text = "Home" , fontSize = 22.sp)
        
    }
}