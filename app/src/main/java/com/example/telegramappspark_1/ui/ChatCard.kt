package com.example.telegramappspark_1.ui

import android.R.attr.lineHeight
import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R
import com.example.telegramappspark_1.ui.theme.Roboto
import java.nio.file.WatchEvent


@Composable
fun ChatCard(chatState: ChatState, modifier: Modifier) {
    Box(
        modifier
            .fillMaxWidth()
            .background(color = Color.White),
    ) {
        Column() {
            Row() {
                Image(
                    painter = painterResource(chatState.imgLink),
                    null,
                    Modifier
                        .padding(
                        start = 9.dp, top = 7.dp, bottom = 9.dp
                    )
                        .size(60.dp)
                )
                Column(
                    Modifier.padding(horizontal = 10.dp)
                ) {
                    Row()
                    {
                        Text(
                            text = chatState.chatName,
                            color = Color.Black,
                            modifier = Modifier.padding(
                                top = 7.dp,
                                bottom = 1.dp
                            ),
                            lineHeight = 21.sp,
                            fontSize = 16.sp,
                            fontFamily = Roboto,
                            fontWeight = FontWeight.Medium,
                        )
                        if (chatState.isMuted == true) {
                            Image(
                                painter = painterResource(R.drawable.mute),
                                null,
                                modifier = Modifier
                                    .padding(
                                        top = 12.dp,
                                        bottom = 4.dp,
                                        start = 6.dp
                                    )
                            )
                        }
                    }
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
                        modifier = Modifier.padding(bottom = 7.dp),
                        fontSize = 15.sp,
                        fontFamily = Roboto,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 20.sp
                    )
                }

                Column(
                    Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(
                            text = chatState.date,
                            color = Color.Gray,
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier.padding(
                                top = 10.dp, end = 10.dp
                            )
                        )

                    }

                    if (chatState.numberOfUnreadMessages == null && chatState.isPinned == true) {
                        Image(
                            painter = painterResource(R.drawable.pin_icon),
                            null,
                            modifier = Modifier.padding(
                                top = (13.96).dp, bottom = (13.04).dp, end = (9.6).dp
                            ),
                        )
                    } else if (chatState.numberOfUnreadMessages != null) {
                        Box(
                            Modifier
                                .padding(
                                    top = (13.96).dp, bottom = (13.04).dp, end = (9.6).dp
                                )
                                .height(20.dp)
                                .width(26.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(
                                    color = if (chatState.isMuted == true) Color(0xFFAEAEB2)
                                    else Color(0xFFcc5906)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = chatState.numberOfUnreadMessages,
                                color = Color.White,
                                modifier = Modifier

                            )

                        }
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(start = 79.dp),
                color = Color.Gray
            )
        }
    }
}


@Preview
@Composable
private fun N() {
    ChatCard(chatState = MockChatScreenState.chats[4], modifier = Modifier)
}