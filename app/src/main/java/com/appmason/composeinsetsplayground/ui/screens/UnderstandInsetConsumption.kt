package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * https://developer.android.com/jetpack/compose/layouts/insets#inset-consumption
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun UnderstandInsetConsumption() {
    Scaffold { innerPadding ->
        // innerPadding contains inset information for you to use and apply
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Blue)
                .padding(innerPadding)
                // Consume this insets so that it's not applied again when using safeDrawing in the hierarchy below
                .consumeWindowInsets(innerPadding)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Red)
                    .windowInsetsPadding(WindowInsets.safeDrawing)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Green)
                )
            }
        }
    }
}