package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

/**
 * https://developer.android.com/jetpack/compose/layouts/insets#inset-consumption
 */
@Composable
fun UnderstandInsetConsumption() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        var textFieldValue by remember { mutableStateOf(TextFieldValue()) }
        LazyColumn(
            modifier = Modifier.imePadding(),
        ) {
            items(50) { index ->
                TextField(
                    value = textFieldValue,
                    onValueChange = { textFieldValue = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Item $index")
                    }
                )
            }
            item {
                Spacer(
                    Modifier.windowInsetsBottomHeight(
                        WindowInsets.systemBars
                    )
                )
            }
        }
    }
}