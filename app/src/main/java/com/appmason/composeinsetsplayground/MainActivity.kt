package com.appmason.composeinsetsplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.appmason.composeinsetsplayground.ui.screens.DrawEdgeToEdge
import com.appmason.composeinsetsplayground.ui.theme.ComposeInsetsPlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeInsetsPlaygroundTheme {
                DrawEdgeToEdge()
                //DrawWithWindowInsets()
                //DrawWithImePadding()
            }
        }
    }
}