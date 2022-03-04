package com.mahmoudalim.composepoctask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.mahmoudalim.composepoctask.ui.theme.ComposePocTaskTheme
import com.mahmoudalim.presentation.compose.ShimmerSkeletonView
import com.mahmoudalim.presentation.compose.shimmerAnimation
import com.mahmoudalim.presentation.theme.color.AppColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ComposePocTaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White) {
                    ShimmerSkeletonView()
                }
            }
        }
    }
}
