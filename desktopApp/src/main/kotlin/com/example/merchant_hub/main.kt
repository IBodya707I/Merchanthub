package com.example.merchant_hub

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowState = rememberWindowState(
        position = WindowPosition(Alignment.Center),
        width = 400.dp,
        height = 825.dp
    )
    Window(
        onCloseRequest = ::exitApplication,
        title = "Merchant Hub (Mobile Preview)",
        state = windowState,
        resizable = true
    ) {
        val currentDensity = LocalDensity.current
        val scaledDensity = remember(currentDensity) {
            Density(
                density = currentDensity.density * 0.965f,
                fontScale = currentDensity.fontScale * 0.965f
            )
        }
        CompositionLocalProvider(LocalDensity provides scaledDensity) {
            App()
        }
    }
}