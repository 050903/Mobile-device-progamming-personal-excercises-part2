package com.android4dev.spiketune

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import screens.AgeCheckerScreen
import com.android4dev.spiketune.ui.theme.EmailValidationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmailValidationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    AgeCheckerScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000) // Preview trong MainActivity
@Composable
fun DefaultPreview() {
    EmailValidationTheme {
        Surface(color = Color.Black) {
            AgeCheckerScreen()
        }
    }
}