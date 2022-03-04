package com.mahmoudalim.composepoctask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mahmoudalim.composepoctask.navigation.navigate
import com.mahmoudalim.composepoctask.ui.screens.HomeScreen
import com.mahmoudalim.composepoctask.ui.screens.SkeletonScreen
import com.mahmoudalim.composepoctask.ui.theme.ComposePocTaskTheme
import com.mahmoudalim.core.navigation.Route
import com.mahmoudalim.presentation.compose.AppScaffoldHome

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ComposePocTaskTheme {
                val navController = rememberNavController()
                AppScaffoldHome {
                    NavHost(
                        navController = navController,
                        startDestination = Route.SKELETON
                    ) {
                        composable(Route.SKELETON) {
                            SkeletonScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.HOME) {
                            HomeScreen()
                        }
                    }
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}

