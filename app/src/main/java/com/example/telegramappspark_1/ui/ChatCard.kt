package com.example.telegramappspark_1.ui

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.ui.theme.Roboto
import java.nio.file.WatchEvent


@Composable
fun ChatCard(chatState: ChatState, modifier: Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .background(color = Color.White),
    ) {
        Image(
            painter = painterResource(chatState.imgLink),
            null,
            Modifier.padding(
                start = 9.dp,
                top = 7.dp,
                bottom = 9.dp
            )
        )
        Column(
            Modifier
                .padding(horizontal = 10.dp)
        ) {
            Text(
                text = chatState.chatName,
                color = Color.Black,
                modifier = Modifier
                    .padding(
                        top = 7.dp,
                        bottom = 1.dp,
                    ),
                lineHeight = 21.sp,
                fontSize = 16.sp,
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
            )
            if (chatState.lastMessageAuthor != null) {
                Text(
                    text = chatState.lastMessageAuthor,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 2.dp),
                    lineHeight = 20.sp,
                    fontSize = 15.sp,
                    fontFamily = Roboto,
                    fontWeight = FontWeight.Normal
                )
            }
            Text(
                text = chatState.chatLastMessage,
                color = Color.Gray,
                modifier = Modifier
                    .padding(bottom = 7.dp),
                fontSize = 15.sp,
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                lineHeight = 20.sp
            )
        }

        Column(
            Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.End
        )
        {
            Row(){

            }
        }


    }
}

@Preview
@Composable
private fun N() {
    ChatCard(chatState = MockChatScreenState.chats[0], modifier = Modifier)
}