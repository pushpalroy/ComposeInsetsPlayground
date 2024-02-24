package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DrawWithWindowInsetsConsumption() {
    Column {
        Spacer(Modifier.windowInsetsTopHeight(WindowInsets.systemBars))

        Column(
            Modifier
                .fillMaxSize()
                .background(color = Color.DarkGray)
                .weight(1f)
                .consumeWindowInsets(
                    WindowInsets.systemBars.only(WindowInsetsSides.Vertical)
                )
        ) {
            // content
            Spacer(
                Modifier
                    .background(color = Color.Yellow)
                    .windowInsetsBottomHeight(WindowInsets.ime)
            )
        }

        Spacer(Modifier.windowInsetsBottomHeight(WindowInsets.systemBars))
    }
}