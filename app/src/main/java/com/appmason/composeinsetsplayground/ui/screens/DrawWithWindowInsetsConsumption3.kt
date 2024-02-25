package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsPadding
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
import androidx.compose.ui.unit.dp

@Composable
fun DrawWithWindowInsetsConsumption3() {
    var textFieldValue by remember { mutableStateOf(TextFieldValue()) }
    LazyColumn(
        Modifier.windowInsetsPadding(WindowInsets.statusBars).imePadding()
    ) {
        items(count = 30) {
            Text(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                text = "Item $it"
            )
        }
        item {
            TextField(
                modifier = Modifier.fillMaxWidth().height(56.dp),
                value = textFieldValue,
                onValueChange = { textFieldValue = it },
                placeholder = { Text(text = "Type something here") }
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