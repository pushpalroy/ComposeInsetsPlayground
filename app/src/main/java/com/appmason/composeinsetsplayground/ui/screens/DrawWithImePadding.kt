package com.appmason.composeinsetsplayground.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imeNestedScroll
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.isImeVisible
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DrawWithImePadding() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f).imeNestedScroll(),
            reverseLayout = true
        ) {
            items(100) { index ->
                Text(text = "Item $index", modifier = Modifier.padding(16.dp).fillMaxWidth())
            }
        }

        var textFieldValue by remember { mutableStateOf(TextFieldValue()) }

        TextField(
            value = textFieldValue,
            onValueChange = { textFieldValue = it },
            modifier = Modifier.fillMaxWidth().imePadding(),
            placeholder = {
                Text(text = "Is visible: ${WindowInsets.isImeVisible}")
            }
        )
    }
}