package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * These modifiers are especially useful for sizing a Spacer that takes up the space of insets.
 */
@Composable
fun DrawWithInsetSizeModifiers() {
    Column {
        Spacer(modifier = Modifier.windowInsetsTopHeight(WindowInsets.statusBars))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Blue)
                .weight(1f)
        )
        Spacer(modifier = Modifier.windowInsetsBottomHeight(WindowInsets.systemBars))
    }
}