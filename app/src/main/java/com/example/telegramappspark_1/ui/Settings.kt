package com.example.telegramappspark_1.ui

import android.content.ClipData.Item
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R

@Preview
@Composable
fun SettingsTg() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF182330))
    ) {
        item {
            Row(modifier = Modifier.fillMaxWidth()) {
                IconButton(
                    onClick = {}, modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp)
                        .size(45.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.leftarow), null, Modifier.fillMaxSize()
                    )
                }
                IconButton(
                    onClick = {}, modifier = Modifier
                        .padding(start = 160.dp)
                        .size(55.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.qrcode1), null, Modifier.fillMaxSize()
                    )
                }
                IconButton(
                    onClick = {}, modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp)
                        .size(45.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.lupa), null, Modifier.fillMaxSize()
                    )
                }
                IconButton(
                    onClick = {}, modifier = Modifier
                        .padding(start = 10.dp, end = 4.dp)
                        .size(55.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.trailing_icon),
                        null,
                        Modifier.fillMaxSize()
                    )
                }
            }
        }
        item {
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(15.dp)
                        .clip(CircleShape)
                        .clickable {}
                        .background(Color.Gray)) {
                    Image(
                        painter = painterResource(R.drawable.avatar),
                        contentDescription = "Профиль",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )
                }
                Column(modifier = Modifier.padding(start = 8.dp, top = 25.dp)) {
                    Text("Mason", color = Color.White, fontSize = 23.sp)
                    Text(
                        "в сети", color = Color.Gray, modifier = Modifier.padding(top = 3.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF212F3F))
                    .clickable { },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.photo1),
                    contentDescription = "Профиль",
                    modifier = Modifier
                        .size(55.dp)
                        .padding(start = 8.dp)

                )
                Text(
                    "Установить фото профиля", color = Color(0xFF368CCC), fontSize = 17.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )


            }
            Spacer(modifier = Modifier.padding(vertical = 10.dp))
            Box(
                modifier = Modifier.background(color = Color(0xFF202a36))
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        "Аккаунт", color = Color(0xFF368CCC),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)
                    )

                    Box(modifier = Modifier.clickable { }) {
                        Column {
                            Text(
                                "+7 (967) 747-27-37",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                            Text(
                                "Нажмите, чтобы изенить номер телефона",
                                color = Color.Gray,
                                modifier = Modifier.padding(top = 6.dp)
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .clickable { }
                            .padding(top = 10.dp)) {
                        Column {
                            Text(
                                "@rbmason",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(top = 8.dp),

                                )
                            Text(
                                "Имя пользователя",
                                color = Color.Gray,
                                modifier = Modifier.padding(top = 6.dp)
                            )
                        }


                    }
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(color = Color(0xFF182330))
                            .padding(20.dp)
                    )
                    Box(
                        modifier = Modifier
                            .clickable { }
                            .padding()) {
                        Column {
                            Text(
                                "О себе",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                            Text(
                                "Напиши немного о себе",
                                color = Color.Gray,
                                modifier = Modifier.padding(top = 6.dp, bottom = 10.dp)
                            )
                        }
                    }
                }

            }
        }
    }
}
