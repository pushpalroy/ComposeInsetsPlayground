package com.appmason.composeinsetsplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.appmason.composeinsetsplayground.ui.screens.DrawEdgeToEdge
import com.appmason.composeinsetsplayground.ui.screens.DrawWithBuiltInPaddingModifiers
import com.appmason.composeinsetsplayground.ui.screens.DrawWithImePadding
import com.appmason.composeinsetsplayground.ui.screens.DrawWithInsetSizeModifiers
import com.appmason.composeinsetsplayground.ui.screens.DrawWithScaffoldAndInsetConsumption
import com.appmason.composeinsetsplayground.ui.screens.DrawWithWindowInsetsConsumption1
import com.appmason.composeinsetsplayground.ui.screens.DrawWithWindowInsetsConsumption2
import com.appmason.composeinsetsplayground.ui.screens.DrawWithWindowInsetsConsumption3
import com.appmason.composeinsetsplayground.ui.screens.DrawWithWindowInsetsPadding
import com.appmason.composeinsetsplayground.ui.theme.ComposeInsetsPlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            /**
             * There are two primary ways to use these inset types to adjust your Composable layouts:
             * padding modifiers and inset size modifiers.
             *
             * Uncomment one composable at a time to see in action
             */
            ComposeInsetsPlaygroundTheme {
                // Edge to edge without insets
                DrawEdgeToEdge()

                // With padding modifiers
                // Applies the given window insets as padding
                // DrawWithWindowInsetsPadding()
                // DrawWithImePadding()
                // DrawWithBuiltInPaddingModifiers()

                // With inset size modifiers
                // These modifiers are especially useful for sizing a Spacer that takes up the space of insets
                // DrawWithInsetSizeModifiers()

                // Inset Consumption
                // Doc: https://developer.android.com/jetpack/compose/layouts/insets#inset-consumption
                // DrawWithWindowInsetsConsumption1()
                // DrawWithWindowInsetsConsumption2()
                // DrawWithWindowInsetsConsumption3()
                // DrawWithScaffoldAndInsetConsumption()
            }
        }
    }
}