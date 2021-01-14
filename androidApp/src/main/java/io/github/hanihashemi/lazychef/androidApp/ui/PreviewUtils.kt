package io.github.hanihashemi.lazychef.androidApp.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
internal fun ThemedPreview(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    LazyChefTheme(darkTheme = darkTheme) {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}
