package com.example.telegramappspark_1.ui

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R

//@Preview(heightDp = 1350)
@SuppressLint("ResourceType")
@Composable
fun settings_Chats(user: UserData) {
    Box()
    {
        val months = listOf(
            "Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        )
        var isEnterOn by remember { mutableStateOf(true) }
        var isDirectShare by remember { mutableStateOf(true) }
        var isSparkTheme by remember { mutableStateOf(false) }
        var isDarkTheme by remember { mutableStateOf(true) }
        var currentUser by remember { mutableStateOf(user) }
        var always by remember { mutableStateOf(true) }
        var contakts by remember { mutableStateOf(false) }
        var nobody by remember { mutableStateOf(false) }
        var showmore by remember { mutableStateOf(false) }
        val alpha by animateFloatAsState(
            targetValue = if (showmore) 1f else 0f,
            animationSpec = tween(durationMillis = 300)
        )
        val offsetY by animateFloatAsState(
            targetValue = if (showmore) 0f else -20f,
            animationSpec = tween(durationMillis = 300)

        )
        var sliderValue by remember { mutableStateOf(30f) }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF182330))
                .padding(top = 40.dp)
        ) {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF1b2633))
                ) {
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .padding(start = 10.dp, top = 5.dp)
                            .size(45.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.leftarow),
                            null,
                            Modifier.fillMaxSize()
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "Настройки чатов",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 14.dp, start = 8.dp),
                            color = Color.White
                        )
                    }
                    Row(
                        Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = { showmore = true }, modifier = Modifier
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
            }
            item {
                Box(
                    modifier = Modifier.background(color = Color(0xFF202a36))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            "Размер текста сообщений?", color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)
                        )



                        Row(
                            modifier = Modifier

                                .padding(
                                    bottom = 5.dp,
                                    top = 5.dp
                                ), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Slider(
                                value = sliderValue, onValueChange = { sliderValue = it },
                                valueRange = 12f..30f,
                                colors = SliderDefaults.colors(
                                    thumbColor = Color.Blue,
                                    inactiveTrackColor = Color(0xFF314356),
                                    activeTrackColor = Color(0xFF368CCC)
                                ),
                                modifier = Modifier
                                    .padding()
                                    .fillMaxWidth(0.8f),
                            )
                            Row(
                                modifier = Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    "${sliderValue.toInt()}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(end = 23.dp)
                                )

                            }
                        }
                        Row(modifier = Modifier.padding(top = 7.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )
                        }


                    }


                }




                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {
                    Box(
                        modifier = Modifier
                            .padding()
                            .fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.avatar),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            alpha = 0.8f,
                            modifier = Modifier.matchParentSize()
                        )
                        Column(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .fillMaxWidth()
                        ) {
                            Spacer(modifier = Modifier.padding(vertical = 6.dp))
                            Spacer(modifier = Modifier.padding(vertical = 6.dp))
                            Spacer(modifier = Modifier.padding(vertical = 6.dp))

                            Row(
                                modifier = Modifier
                                    .clip(
                                        RoundedCornerShape(20.dp)
                                    )

                                    .background(Color(0xFF314356))
                                    .padding(7.dp)
                                    .fillMaxWidth(0.5f)
                            ) {
                                Text(
                                    "Знаешь который час?",
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 7.dp),
                                    fontSize = 13.sp,

                                    )
                                Row(
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        "15:10", color = Color.Gray,
                                        fontSize = 11.sp,

                                        )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(20.dp)
                                    .fillMaxWidth()
                                    .clip(
                                        RoundedCornerShape(20.dp)
                                    )
                                    .background(Color(0xFF314356))
                                    .padding(10.dp)
                                    .fillMaxWidth(0.4f),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.Bottom
                            ) {
                                Text(
                                    "В Токио утро!!!)",
                                    color = Color.White,
                                    fontSize = 13.sp,
                                    modifier = Modifier.padding(
                                        start = 7.dp,
                                        bottom = 20.dp,
                                        top = 20.dp
                                    )

                                )
                                Row(
                                    modifier = Modifier
                                ) {
                                    Text(
                                        "15:14",
                                        color = Color.Gray,
                                        fontSize = 10.sp,
                                        modifier = Modifier.padding(
                                            start = 7.dp,
                                            bottom = 20.dp,
                                            end = 20.dp,
                                            top = 20.dp
                                        )
                                    )
                                }
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .clickable { }
                            .fillMaxWidth()
                            .padding(top = 15.dp, start = 13.dp, bottom = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.image),
                            contentDescription = "Профиль",
                            modifier = Modifier
                                .size(30.dp)
                                .padding()
                        )
                        Spacer(modifier = Modifier.padding(vertical = 5.dp))
                        Text(
                            "Изменить обои",
                            color = Color(0xFF368CCC),
                            fontSize = 16.sp, fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                    Box(modifier = Modifier.padding(top = 7.dp)) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(3.dp)
                                .background(color = Color(0xFF182330))

                        )
                    }
                    Row(
                        modifier = Modifier
                            .clickable { }
                            .fillMaxWidth()
                            .padding(top = 15.dp, start = 13.dp, bottom = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.user),
                            contentDescription = "Профиль",
                            modifier = Modifier
                                .size(30.dp)
                                .padding()
                        )
                        Spacer(modifier = Modifier.padding(vertical = 5.dp))
                        Text(
                            "Изменить цвет имени",
                            color = Color(0xFF368CCC),
                            fontSize = 16.sp, fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }


                }
            }
            item {

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {

                    Column {
                        Text(
                            "Цветовая схема",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Box(modifier = Modifier.padding(top = 7.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )

                        }
                        if (isDarkTheme) {
                            Row(
                                modifier = Modifier
                                    .clickable { isDarkTheme = !isDarkTheme }
                                    .fillMaxWidth()
                                    .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Image(
                                    painter = painterResource(R.drawable.sun_light),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Переключить на дневную тему",
                                    color = Color(0xFF368CCC),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 10.dp)
                                )
                            }
                        } else if (!isDarkTheme) {
                            Row(
                                modifier = Modifier
                                    .clickable { isDarkTheme = !isDarkTheme }
                                    .fillMaxWidth()
                                    .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Image(
                                    painter = painterResource(R.drawable.sun_dark),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Переключить на тёмную тему",
                                    color = Color(0xFF368CCC),
                                    fontSize = 16.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 10.dp)
                                )
                            }
                        }
                        Box(modifier = Modifier.padding(top = 7.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )

                        }
                        if (!isSparkTheme) {

                            Row(
                                modifier = Modifier
                                    .clickable { isSparkTheme = !isSparkTheme }
                                    .fillMaxWidth()
                                    .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.settings_spark),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Переключить на SparkGramTheme",
                                    color = Color(0xFFcc5906),
                                    fontSize = 16.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 10.dp)
                                )
                            }
                        } else if (isSparkTheme) {

                            Row(
                                modifier = Modifier
                                    .clickable { isSparkTheme = !isSparkTheme }
                                    .fillMaxWidth()
                                    .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.settings),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Переключить на TelegramTheme",
                                    color = Color(0xFF368CCC),
                                    fontSize = 16.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 10.dp)
                                )

                            }


                        }
                    }
                }
            }
            item {

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                )
                {
                    Column(modifier=Modifier.padding( bottom = 12.dp)) {
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Text(
                            "Прочие настройки",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Box(modifier = Modifier.padding(top = 7.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )

                        }
                            Row(
                                modifier = Modifier
                                    .clickable { isDirectShare = !isDirectShare }
                                    .fillMaxWidth()
                                    .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {


                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Column(modifier = Modifier.padding(start = 7.dp)) {
                                    Text(
                                        "Direct Share",
                                        color = Color(0xFF368CCC),
                                        fontSize = 20.sp, fontWeight = FontWeight.Medium,
                                        modifier = Modifier.padding()
                                    )
                                    Text(
                                        "Показывать недавние чаты в меню",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(end = 20.dp)
                                        .fillMaxSize(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.End
                                ) {if (isDirectShare) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                }

                                else if (!isDirectShare){
                                    Image(
                                        painter = painterResource(R.drawable.switch_dark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier
                                    )

                                }
                            }
                        }
                        Box(modifier = Modifier.padding(top = 7.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )

                        }
                        Row(
                            modifier = Modifier
                                .clickable { isEnterOn=!isEnterOn }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Column(modifier = Modifier.padding(start = 7.dp)) {
                                Text(
                                    "Отправка по Enter",
                                    color = Color(0xFF368CCC),
                                    fontSize = 20.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )
                                Text(
                                    "Отменяет перенос строки по Enter",
                                    color = Color.Gray,
                                    fontSize = 14.sp
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {if (isEnterOn) {
                                Image(
                                    painter = painterResource(R.drawable.switch_notdark),
                                    contentDescription = "Профиль",
                                    modifier = Modifier


                                )

                            }

                            else if (!isEnterOn){
                                Image(
                                    painter = painterResource(R.drawable.switch_dark),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                )

                            }
                            }
                        }
                    }
                }

            }
        }

        if (showmore) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f * alpha))
            )
        }
        if (showmore) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { showmore = false }) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp, start = 60.dp, end = 10.dp)
                        .offset(y = offsetY.dp)
                        .shadow(8.dp, RoundedCornerShape(8.dp))
                        .background(Color(0xFF2a3c52), RoundedCornerShape(8.dp))
                        .padding(start = 10.dp, end = 10.dp, bottom = 4.dp, top = 4.dp)
                        .clickable() {}
                ) {
                    Column {
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .padding(top = 10.dp, bottom = 10.dp)
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.clear),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Создать новую  тему",
                                color = Color.White,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .padding(top = 10.dp, bottom = 10.dp)
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.history),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Восстановить по умолчанию",
                                color = Color.White,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }

                    }
                }

            }
        }

    }

}

@Preview
@Composable
fun Selegr2amAppSpdark1Thgemsdde() {
    settings_Chats(
        user = UserData(
            UsFirstName = "Alex",
            UsDateOfBirthday = "30.09.2006",
            UsPhoneNumber = "+ 7 963 132 83 90",
            UsLastName = "Mas0n",
            UsDiscription = "Fucking Woods",
            UsNickName = "@Mas0nchik",
            UsPersonalChannel =
                UsChannel(
                    UsPersonalChannelName = "Kanal Mason'a",
                    UsPersonalChannelSubsCount = 32,
                    UsPersonalChannelLastSms = "Last Massage",
                    UsPersonalChannelImageId = R.drawable.avatar,
                    LastMassageIsRead = true
                )
        )
    )
}
