package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DrawEdgeToEdge() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    )
}