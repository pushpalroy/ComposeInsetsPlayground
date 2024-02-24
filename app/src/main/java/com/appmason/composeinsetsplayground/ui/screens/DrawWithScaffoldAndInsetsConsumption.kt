package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * By default, Scaffold provides insets as parameter paddingValues for you to consume and use.
 * Scaffold does not apply the insets to content; this responsibility is yours.
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DrawWithScaffoldAndInsetConsumption() {
    val colors = listOf(Color.Red, Color.Blue, Color.Yellow)
    Scaffold { innerPadding ->
        // innerPadding contains inset information for you to use and apply
        LazyColumn(
            // consume insets as scaffold doesn't do it by default
            modifier = Modifier.consumeWindowInsets(innerPadding),
            contentPadding = innerPadding
        ) {
            items(count = 30) {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(colors[it % colors.size])
                )
            }
        }
    }
}