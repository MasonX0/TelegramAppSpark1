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
                SettingsTg(user = UserData(
                    UsFirstName = "Alex",
                    UsPhoneNumber = "+ 7 963 132 83 90",
                    UsLastName = "Mas0n",
                    UsDiscription = "Fucking Woods",
                    UsNickName = "Mas0nchik",
                ))
                }
            }
        }
    }