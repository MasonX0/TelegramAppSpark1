package com.example.telegramappspark_1.ui

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R
import com.example.telegramappspark_1.ui.theme.Roboto
import java.nio.file.WatchEvent


@Composable
fun ChatsScreen(mock: ChatsScreenState, modifier: Modifier) {
    Box(
        modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    Pair(0f, Color(0xFFcc5906)),
                    Pair(1f, Color(0xFFF00000))
                )
            )
    ) {}
    Column(modifier = modifier) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Box(
                Modifier
                    .clickable {}
                    .padding(5.dp)) {
                Image(
                    painter = painterResource(R.drawable.gear),
                    null,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
            Text(
                "SparkGram",
                fontSize = 40.sp,
                color = Color.White,
                modifier = Modifier.padding(5.dp),
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium
            )
            Box(
                Modifier
                    .clickable {}
                    .padding(5.dp)) {
                Image(
                    painter = painterResource(R.drawable.edit_icon),
                    null,
                    modifier = Modifier
                        .size(37.dp)
                )
            }

        }
        Row(
            Modifier
                .padding(vertical = 10.dp)
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                "Search chats",
                {},
                Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(50.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray,
                    unfocusedContainerColor = Color.White
                ),
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.loupe),
                        null,
                        modifier = Modifier
                            .size(20.dp)
                    )
                }
            )
        }
        HorizontalDivider(modifier = Modifier
            .fillMaxWidth(),
            color = Color.DarkGray)

        LazyColumn(
            modifier = Modifier
                .height(620.dp)
                .fillMaxWidth()
                .background(Color.White)
        ) {
            items(mock.chats) {chat -> ChatCard(chatState = chat, modifier = Modifier)  }
        }

        HorizontalDivider(modifier = Modifier
            .fillMaxWidth(),
            color = Color.DarkGray)

        Box(modifier = Modifier
            .fillMaxSize())
    }
}


@Preview
@Composable
private fun ChatsScreenPreview() {
    ChatsScreen(mock = MockChatScreenState, modifier = Modifier)
}