package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.safeGesturesPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DrawWithBuiltInPaddingModifiers() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
            .safeDrawingPadding() // Equivalent to windowInsetsPadding(WindowInsets.safeDrawing)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Red)
                .safeContentPadding() // Equivalent to windowInsetsPadding(WindowInsets.safeContent)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Green)
                    .safeGesturesPadding() // Equivalent to windowInsetsPadding(WindowInsets.safeGestures)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Magenta)
                )
            }
        }
    }
}