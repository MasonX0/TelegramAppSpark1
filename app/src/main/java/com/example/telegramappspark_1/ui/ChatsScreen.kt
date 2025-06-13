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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R


@Preview
@Composable
fun ChatsScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(
                Pair(0f, Color(0xFFFcc5906)),
                Pair(1f, Color(0xFFF00000))))
    ) {}
    Column() {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Box(
                Modifier
                    .clickable {}
                    .padding(5.dp)) {
                Image(
                    painter = painterResource(R.drawable.gear),
                    null
                )
            }
            Text(
                "SparkGram",
                fontSize = 40.sp,
                color = Color.White,
                modifier = Modifier.padding(5.dp)
            )
            Box(
                Modifier
                    .clickable {}
                    .padding(5.dp)) {
                Image(
                    painter = painterResource(R.drawable.loupe),
                    null
                )
            }

        }
        Row(Modifier.padding(vertical = 10.dp)
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.Center) {
                TextField(
                    "Search chats",
                    {},
                    Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(50.dp),
                    colors = TextFieldDefaults.colors(unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent)

                )
        }



    }
}