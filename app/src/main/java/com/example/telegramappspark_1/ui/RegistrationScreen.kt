package com.example.telegramappspark_1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R
import kotlinx.coroutines.selects.RegistrationFunction

@Preview
@Composable
fun RegistrationScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    Pair(0f, Color(0xFFFc5906)),
                    Pair(
                        1f, Color(0xFFF00000)
                    )
                )
            )
    )
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                Modifier
                    .clickable {}) {
                Row(
                    Modifier
                        .padding(
                            horizontal = 5.dp,
                            vertical = 7.dp
                        )
                ) {
                    Image(
                        painter = painterResource(R.drawable.backarrow2),
                        null
                    )
                    Text(
                        "Back",
                        color = Color.White,
                        fontSize = 27.sp
                    )
                }
            }

            Box(
                Modifier
                    .clickable {}
                    .padding(
                        horizontal = 10.dp,
                        vertical = 7.dp
                    )) {
                Text(
                    "Done",
                    fontSize = 27.sp,
                    color = Color.White,
                    fontWeight = FontWeight(600)
                )
            }
        }

        Column(
            Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box() {
                Text(
                    "Create your profile",
                    color = Color.White,
                    fontSize = 15.sp
                )
                Text(
                    "Create your profile",
                    style = TextStyle(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFa64500),
                                Color(0xFFff6a00)
                            )
                        )
                    ),
                    fontSize = 14.sp
                    )
            }

        }
    }
}