package com.mahmoudalim.composepoctask.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mahmoudalim.composepoctask.navigation.navigate
import com.mahmoudalim.composepoctask.ui.screens.home.screen.HomeScreen
import com.mahmoudalim.composepoctask.ui.screens.skeleton.SkeletonScreen
import com.mahmoudalim.composepoctask.ui.theme.ComposePocTaskTheme
import com.mahmoudalim.composepoctask.navigation.Route
import com.mahmoudalim.composepoctask.ui.screens.home.vm.HomeScreenViewModel
import com.mahmoudalim.presentation.compose.AppScaffoldHome
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val vm: HomeScreenViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ComposePocTaskTheme {
                val navController = rememberNavController()
                AppScaffoldHome {
                    AppScaffoldContent(navController)
                }
            }
        }
    }

    @Composable
    private fun AppScaffoldContent(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = Route.SKELETON
        ) {
            composable(Route.SKELETON) {
                SkeletonScreen(onNavigate = navController::navigate)
            }
            composable(Route.HOME) {
                HomeScreen(vm)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}

