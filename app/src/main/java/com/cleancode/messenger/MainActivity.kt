package com.cleancode.messenger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cleancode.messenger.ui.theme.AndroidMessengerTheme
import com.cleancode.templates.android_library.TestAndroidLibrary
import com.cleancode.templates.feature.domain.FeatureDomain
import com.cleancode.templates.kotlin_library.TestKotlinLib
import com.cleancode.templates.feature.presentation.FeaturePresentation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        TestAndroidLibrary()
        TestKotlinLib()
        FeaturePresentation()
        FeatureDomain()
        enableEdgeToEdge()
        setContent {
            AndroidMessengerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidMessengerTheme {
        Greeting("Android")
    }
}