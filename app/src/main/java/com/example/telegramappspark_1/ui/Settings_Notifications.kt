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
import androidx.compose.ui.draw.alpha
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
fun settings_Notf(user: UserData) {
    Box()
    {
        val months = listOf(
            "Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        )



        var showQn by remember { mutableStateOf(false)}
        var isNotifPinnedMassage by remember { mutableStateOf(true) }
        var isNotifSoundInChatAction by remember { mutableStateOf(true) }
        var isNotifShowText by remember { mutableStateOf(true) }
        var isNotifFirstTime by remember { mutableStateOf(true) }
        var isNotifSoundInApp by remember { mutableStateOf(true) }
        var isNotifVibro by remember { mutableStateOf(true) }
        var isNotifShowTextInApp by remember { mutableStateOf(true) }
        var isNotifSoundInChatApp by remember { mutableStateOf(true) }

        var isNotifAllAccs by remember { mutableStateOf(true) }
        var isNotifPersnlChats by remember { mutableStateOf(true) }
        var isNotifGroups by remember { mutableStateOf(true) }
        var isNotifChannels by remember { mutableStateOf(true) }
        var isNotifHistorys by remember { mutableStateOf(false) }
        var isNotifReactions by remember { mutableStateOf(true) }
        var inAppsoundSound by remember { mutableStateOf(true) }
        var inAppsoundVibro by remember { mutableStateOf(true) }
        var inAppsoundShowText by remember { mutableStateOf(true) }
        var inAppsoundSoundInChat by remember { mutableStateOf(true) }
        var inAppsoundPopUps by remember { mutableStateOf(true) }

        val alpha by animateFloatAsState(
            targetValue = if (showQn) 1f else 0f,
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
                            "Уведомления и звуки",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 14.dp, start = 8.dp),
                            color = Color.White
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
                            "Показывать уведомления",
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
                            Row(
                                modifier = Modifier
                                    .clickable {isNotifAllAccs=!isNotifAllAccs }
                                    .fillMaxWidth()
                                    .padding(start = 20.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    "Всех аккаунтов",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                                Row(
                                    modifier = Modifier
                                        .padding(end = 20.dp)
                                        .fillMaxSize(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    if (isNotifAllAccs) {
                                        Image(
                                            painter = painterResource(R.drawable.switch_notdark),
                                            contentDescription = "Профиль",
                                            modifier = Modifier


                                        )

                                    } else if (!isNotifAllAccs) {
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
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Column {
                        Text(
                            "Отключите, если хотите получать только", color = Color.Gray,
                            fontSize = 15.sp,
                        )
                        Text(
                            "уведомления активного аккаунта", color = Color.Gray,
                            fontSize = 15.sp,
                        )
                    }

                }
            }
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                )
                {
                    Column(modifier = Modifier.padding(bottom = 12.dp)) {
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Text(
                            "Уведомления из чатов",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 7.dp, start = 20.dp, bottom = 7.dp)
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
                                .clickable { isNotifPersnlChats = !isNotifPersnlChats }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(R.drawable.user),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Личные чаты",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )
                                if (isNotifPersnlChats) {
                                    Text(
                                        "Включены, 5 исключений",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                } else if (!isNotifPersnlChats) {
                                    Text(
                                        "Отключены",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifPersnlChats) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifPersnlChats) {
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
                                .clickable { isNotifGroups = !isNotifGroups }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.users),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Группы",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )
                                if (isNotifGroups) {
                                    Text(
                                        "Включены, 5 исключений",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                } else if (!isNotifGroups) {
                                    Text(
                                        "Отключены",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifGroups) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifGroups) {
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
                                .clickable { isNotifChannels = !isNotifChannels }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.rss),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Группы",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )
                                if (isNotifChannels) {
                                    Text(
                                        "Включены, 5 исключений",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                } else if (!isNotifChannels) {
                                    Text(
                                        "Отключены",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifChannels) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifChannels) {
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
                                .clickable { isNotifHistorys = !isNotifHistorys }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.play),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Истории",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )
                                if (isNotifHistorys) {
                                    Text(
                                        "Включены, 5 исключений",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                } else if (!isNotifHistorys) {
                                    Text(
                                        "Отключены",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifHistorys) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifHistorys) {
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
                                .clickable { isNotifReactions = !isNotifReactions }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.heart_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Реакции",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )
                                if (isNotifReactions) {
                                    Text(
                                        "Включены, 5 исключений",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                } else if (!isNotifReactions) {
                                    Text(
                                        "Отключены",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifReactions) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifReactions) {
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



            item {
                Spacer (Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ){
                    Column(modifier = Modifier.padding(bottom = 12.dp)) {
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Text(
                            "В приложении",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 7.dp, start = 20.dp, bottom = 7.dp)
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
                                .clickable { isNotifSoundInApp=!isNotifSoundInApp}
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Звук",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifSoundInApp) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifSoundInApp) {
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
                                .clickable { isNotifVibro=!isNotifVibro}
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Вибросигнал",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifVibro) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifVibro) {
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
                                .clickable {isNotifShowTextInApp=!isNotifShowTextInApp }
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Показывать текст",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifShowTextInApp) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifShowTextInApp) {
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
                                .clickable {isNotifSoundInChatApp=!isNotifSoundInChatApp }
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Звук в чате",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifSoundInChatApp) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifSoundInChatApp) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_dark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier
                                    )

                                }
                            }
                        }

                    }



                }}
            item {
                Spacer (Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ){
                    Column(modifier = Modifier.padding(bottom = 12.dp)) {
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Text(
                            "События",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 7.dp, start = 20.dp, bottom = 7.dp)
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
                                .clickable {isNotifSoundInChatAction=!isNotifSoundInChatAction }
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Звук в чате",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifSoundInChatAction) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifSoundInChatAction) {
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
                                .clickable { isNotifPinnedMassage=!isNotifPinnedMassage}
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Закрепленные сообщения",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifPinnedMassage) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifPinnedMassage) {
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
                                .clickable { isNotifAllAccs=!isNotifAllAccs}
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Показывать текст",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifAllAccs) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifAllAccs) {
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
                                .clickable {isNotifFirstTime=!isNotifFirstTime }
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Контакт впервые в SparkGram",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding()
                            )

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isNotifFirstTime) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier


                                    )

                                } else if (!isNotifFirstTime) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_dark),
                                        contentDescription = "Профиль",
                                        modifier = Modifier
                                    )

                                }
                            }
                        }

                    }



                }}
            item {
                Spacer (Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ){
                    Column(modifier = Modifier.padding(bottom = 12.dp)) {
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Text(
                            "Сброс",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 7.dp, start = 20.dp, bottom = 7.dp)
                        )


                        Column (
                            modifier = Modifier
                                .clickable { showQn=true}
                                .fillMaxWidth()
                                .padding(start = 20.dp)
                        ) {
                            Text(
                                "Сбросить настройки уведомлений",
                                color = Color.White,
                                fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(top=5.dp, bottom = 5.dp)
                            )
                            Text(
                                "Сбросить все особые настройки уведомлений для",
                                color = Color.Gray,
                                fontSize = 15.sp ,
                                modifier = Modifier.padding()
                            )
                            Text(
                                "отдельных контактов, групп и каналов.",
                                color = Color.Gray,
                                fontSize = 15.sp,
                                modifier = Modifier.padding()
                            )
                        }

                    }



                }}
        }
        if (showQn) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f * alpha))
            )
        }
        if (showQn) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { showQn = false },
                contentAlignment = Alignment.Center,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .alpha(alpha)
                        .shadow(8.dp, RoundedCornerShape(8.dp))
                        .background(Color(0xFF2a3c52), RoundedCornerShape(8.dp))
                        .padding(8.dp)
                        .clickable() {},
                    contentAlignment = Alignment.Center,
                ) {
                    Column(
                        modifier = Modifier.padding(
                            15.dp
                        )
                    ) {
                        Text(
                            "Сбросить настройки",
                            modifier = Modifier.padding(bottom = 5.dp),
                            color = Color.White,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            "уведомлений",
                            modifier = Modifier.padding(bottom = 5.dp),
                            color = Color.White,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            "Вы точно хотите сбросить",
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp),
                            fontSize = 20.sp,
                        )
                        Text(
                            "настройки уведомлений и",
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp),
                            fontSize = 20.sp,
                        )
                        Text(
                            "использовать настройки по",
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp),
                            fontSize = 20.sp,
                        )
                        Text(
                            "умолчанию?",
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp),
                            fontSize = 20.sp,
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                        ) {
                            Text(
                                "Отмена",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .clickable {showQn=false},
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF368CCC),
                                fontSize = 20.sp,

                            )
                            Spacer(Modifier.padding(horizontal = 20.dp))
                            Text(
                                "Сброс",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .clickable {showQn=false},
                                fontWeight = FontWeight.Bold,
                                color = Color.Red,
                                fontSize = 20.sp

                            )

                        }
                    }
                }
            }
        }
    }

}

@Preview(heightDp = 2000)
@Composable
fun Selegr2amAppSpdassrk1Thgemsdde() {
    settings_Notf(
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
