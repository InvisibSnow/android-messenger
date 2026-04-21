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
import com.cleancode.messenger.core.essentials.exception.ConnectionException
import com.cleancode.messenger.core.essentials.exception.mapper.ExceptionToMessageMapper
import com.cleancode.messenger.core.essentials.logger.Logger
import com.cleancode.messenger.ui.theme.AndroidMessengerTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var exceptionToMessageMapper: ExceptionToMessageMapper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val message1 = exceptionToMessageMapper.getLocalizedMessage(ConnectionException())
        val message2 = ExceptionToMessageMapper.getLocalizedMessage(ConnectionException())

        Logger.d(message1)
        Logger.d(message2)

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