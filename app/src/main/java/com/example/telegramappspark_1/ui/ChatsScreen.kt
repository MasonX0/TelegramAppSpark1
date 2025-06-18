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
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
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
            .background(color = Color.White)) {}
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
                color = Color(0xFFcc5906L),
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
                "Search for messages or users",
                {},
                Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(50.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray
                ),
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.loupe),
                        null,
                        modifier = Modifier
                            .size(20.dp)
                    )
                },
                textStyle = TextStyle(
                    fontSize = 17.sp,
                    fontFamily = Roboto
                ),

            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            items(mock.chats) { chat -> ChatCard(chatState = chat, modifier = Modifier) }
        }


    }
    Column(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(85.dp)
                .background(Color(0xFFcc5906)),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box(modifier = Modifier
                .padding(top = 10.dp)
                .clickable{}) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.contacts),
                        null,
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        "Contacts",
                        color = Color.White
                    )
                }
            }
            Box(modifier = Modifier
                .padding(top = 10.dp)
                .clickable{}) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.chats),
                        null,
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        "Chats",
                        color = Color.White
                    )

                }
            }
            Box(modifier = Modifier
                .padding(top = 10.dp)
                .clickable{}) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.phone),
                        null,
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        "Calls",
                        color = Color.White
                    )

                }
            }

        }
    }

}


@Preview
@Composable
private fun ChatsScreenPreview() {
    ChatsScreen(mock = MockChatScreenState, modifier = Modifier)
}