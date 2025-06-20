package com.example.telegramappspark_1

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
import com.example.telegramappspark_1.ui.SettingsTg
import com.example.telegramappspark_1.ui.UserData
import com.example.telegramappspark_1.ui.theme.TelegramAppSpark1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelegramAppSpark1Theme {
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

fun Show() {
    SettingsTg(user= UserData(
        UsFirstName = "Alex",
        UsLastName = "Mason",
        UsDiscription = "Работаем",
        UsPhoneNumber = "+7 967 747 27 37",
        UsNickName = "@MasonFromRb",
        UsDateOfBirthday = "30.09.2006",
        UsPersonalChannel = null,
    ))
}