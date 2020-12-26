package io.github.hanihashemi.lazychef.androidApp

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import io.github.hanihashemi.lazychef.androidApp.ui.LazyChefTheme
import io.github.hanihashemi.lazychef.androidApp.ui.home.HomeScreen
import io.github.hanihashemi.lazychef.androidApp.ui.recipe.RecipeScreen

@Composable
fun LazyChefApp(navigationViewModel: NavigationViewModel) {
    LazyChefTheme {
        AppContent(navigationViewModel = navigationViewModel)
    }
}

@Composable
private fun AppContent(navigationViewModel: NavigationViewModel) {
    Crossfade(navigationViewModel.currentScreen) { screen ->
        Surface(color = MaterialTheme.colors.background) {
            when (screen) {
                is Screen.Home -> HomeScreen(
                    navigateTo = navigationViewModel::navigateTo,
                )
                is Screen.Recipe -> RecipeScreen(
                    id = screen.recipeId,
                    onBack = { navigationViewModel.onBack() }
                )
            }
        }
    }
}
