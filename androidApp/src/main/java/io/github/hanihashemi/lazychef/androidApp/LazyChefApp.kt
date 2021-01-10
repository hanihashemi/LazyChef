package io.github.hanihashemi.lazychef.androidApp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.hanihashemi.lazychef.androidApp.ui.LazyChefTheme
import io.github.hanihashemi.lazychef.androidApp.ui.home.HomeScreen
import io.github.hanihashemi.lazychef.androidApp.ui.recipe.RecipeScreen

enum class Screens { HOME, RECIPE }

@Composable
fun LazyChefApp() {
    LazyChefTheme { AppContent() }
}

@Composable
private fun AppContent() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screens.HOME.name) {
        composable(Screens.HOME.name) { HomeScreen(navController) }
        composable(Screens.RECIPE.name) { RecipeScreen() }
    }
}
// Crossfade(navigationViewModel.currentScreen) { screen ->
//     Surface(color = MaterialTheme.colors.background) {
//         when (screen) {
//             is Screen.Home -> HomeScreen(
//                 navigateTo = navigationViewModel::navigateTo,
//             )
//             is Screen.Recipe -> RecipeScreen(
//                 id = screen.recipeId,
//                 onBack = { navigationViewModel.onBack() }
//             )
//         }
//     }
// }
// }
