package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DrawWithWindowInsetsPadding() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
            .windowInsetsPadding(WindowInsets.statusBars)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Red)
                .windowInsetsPadding(WindowInsets.safeDrawing) // Equivalent to safeDrawingPadding()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Green)
                    .windowInsetsPadding(WindowInsets.safeContent)  // Equivalent to safeContentPadding()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Magenta)
                        .windowInsetsPadding(WindowInsets.safeGestures)  // Equivalent to safeGesturesPadding()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.DarkGray)
                    ) {

                    }
                }
            }
        }
    }
}