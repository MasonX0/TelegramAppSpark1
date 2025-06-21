package com.example.telegramappspark_1.ui

import android.content.ClipData.Item
import android.widget.ImageButton
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

//@Preview(heightDp = 1350)
@Composable
fun SettingsTg(user: UserData) {
    Box()
    {
        var showQn by remember { mutableStateOf(false) }
        var showPopup by remember { mutableStateOf(false) }
        val alpha by animateFloatAsState(
            targetValue = if (showPopup or showQn) 1f else 0f,
            animationSpec = tween(durationMillis = 300)
        )


        val offsetY by animateFloatAsState(
            targetValue = if (showPopup) 0f else -20f,
            animationSpec = tween(durationMillis = 300)
        )
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
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .padding(start = 160.dp)
                            .size(55.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.qrcode1),
                            null,
                            Modifier.fillMaxSize()
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
                        onClick = { showPopup = !showPopup }, modifier = Modifier
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xF1c2b3d))
                ) {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .padding(15.dp)
                            .clip(CircleShape)
                            .clickable {}
                            .background(Color.Gray)) {
                        Image(
                            painter = painterResource(user.UsImageResId),
                            contentDescription = "Профиль",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop

                        )
                    }
                    Column(modifier = Modifier.padding(start = 8.dp, top = 25.dp)) {
                        Text(
                            "${user.UsFirstName} ${user.UsLastName}",
                            color = Color.White,
                            fontSize = 23.sp
                        )
                        Text(
                            "в сети", color = Color.Gray, modifier = Modifier.padding(top = 3.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
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
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
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
                                    user.UsPhoneNumber,
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )
                                Text(
                                    "Нажмите, чтобы изменить номер телефона",
                                    color = Color.Gray,
                                    modifier = Modifier.padding(top = 6.dp)
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
                        Box(
                            modifier = Modifier
                                .clickable { }) {
                            Column {
                                if (user.UsNickName != null) {
                                    Text(
                                        text = user.UsNickName!!,
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        modifier = Modifier.padding(top = 8.dp),

                                        )
                                    Text(
                                        "Имя пользователя",
                                        color = Color.Gray,
                                        modifier = Modifier.padding(top = 6.dp)
                                    )
                                } else if (user.UsNickName == null) {
                                    Text(
                                        text = "Не задано",
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


                        }
                        Box(modifier = Modifier.padding(top = 7.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clickable { }
                                .padding()) {
                            Column {
                                if (user.UsDiscription != null) {
                                    Text(
                                        user.UsDiscription!!,
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        modifier = Modifier.padding(top = 8.dp)
                                    )
                                    Text(
                                        "Напиши немного о себе",
                                        color = Color.Gray,
                                        modifier = Modifier.padding(top = 6.dp, bottom = 10.dp)
                                    )
                                } else if (user.UsDiscription == null) {
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
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {

                    Text(
                        "Настройки",
                        color = Color(0xFF368CCC),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                    )
                }
                Box(
                    modifier = Modifier.background(color = Color(0xFF202a36))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 1.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.message),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Настройки чатов",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.lock_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Конфиденциальность",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bell),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Уведомления и звуки",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.database_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Данные и память",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.battery_charging_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Энергосбережение",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.folder_2),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Папки с чатами",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 10.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.monitor_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Устройства",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 10.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxWidth()
                                .clickable { }
                                .padding(bottom = 10.dp, top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.globe_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Язык",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                "Русский",
                                modifier = Modifier.padding(end = 15.dp),
                                color = Color(0xFF368CCC),
                                fontSize = 15.sp,
                            )

                        }
                    }
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier.background(color = Color(0xFF202a36))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 5.dp, top = 1.dp)
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.premium_guy7nhzmn17d),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "SparkGram Premium",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 10.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.gift_1),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Отправить подарок",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }

                    }
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {

                    Text(
                        "Помощь",
                        color = Color(0xFF368CCC),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                    )
                }
                Box(
                    modifier = Modifier.background(color = Color(0xFF202a36))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .clickable { showQn = !showQn }
                                .fillMaxWidth()
                                .padding(top = 5.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.message_square_1),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Задать вопрос",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        val context = LocalContext.current
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    val intent = Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse("https://vk.com/sparkteamofficial")
                                    )
                                    context.startActivity(intent)

                                }
                                .padding(top = 10.dp, start = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.alert_circle_2),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Вопросы о SparkGram",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 7.dp, start = 53.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))

                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    val intent = Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse("https://vk.com/escapefromtarkov?from=groups")
                                    )
                                    context.startActivity(intent)
                                }
                                .padding(top = 10.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.file_text_1),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Политика конфиденциальности",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))

                Row(
                    modifier = Modifier
                        .clickable { }
                        .padding(top = 10.dp, start = 13.dp, bottom = 10.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "SparkGram для Android v11.12.0 (5997) store bundled arm64-v8a",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth(0.9f)
                        )
                    }
                }
            }

        }
        if (showPopup or showQn) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f * alpha))
            )
        }
        if (showPopup) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { showPopup = false }) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp, start = 100.dp, end = 10.dp)
                        .offset(y = offsetY.dp)
                        .shadow(8.dp, RoundedCornerShape(8.dp))
                        .background(Color(0xFF2a3c52), RoundedCornerShape(8.dp))
                        .padding(16.dp)
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
                                painter = painterResource(R.drawable.edit),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Изменить информацию",
                                color = Color.White,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 10.dp)
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
                                painter = painterResource(R.drawable.log_out),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Выход",
                                color = Color(0xFFFC4C53),
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }

                    }
                }

            }
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
                            "Задать вопрос",
                            modifier = Modifier.padding(bottom = 10.dp),
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            "Пожалуйста, обратите внимание, что в поддержке SparkGram отвечают масоны. Мы постараемся помочь как можно скорее, но ожидание может занять время.",
                            color = Color.White,
                            fontSize = 16.sp,
                        )
                        Text(
                            "Пожалуйста, ознакомтесь с ",
                            color = Color.White,
                            modifier = Modifier.padding(top = 10.dp),
                            fontSize = 16.sp,
                        )
                        Row() {
                            Text(
                                "частыми вопросами о Telegram ",
                                color = Color(0xFF368CCC),
                                fontSize = 16.sp,
                                modifier = Modifier.clickable {})
                            Text(
                                ":",
                                color = Color.White,
                                fontSize = 16.sp,
                            )
                        }

                        Text(
                            "там есть ответ на большинство вопросов и важные советы по ",
                            color = Color.White,
                            fontSize = 16.sp,
                        )
                        Row() {
                            Text(
                                "устранению неполадок",
                                color = Color(0xFF368CCC), fontSize = 16.sp,
                                modifier = Modifier.clickable {})
                            Text(
                                ".",
                                color = Color.White,
                                fontSize = 16.sp,
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                "Отмена",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .clickable {},
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF368CCC),
                                fontSize = 18.sp
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                "Спросить волонтёров",
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 15.dp)
                                    .clickable {},
                                color = Color(0xFF368CCC),
                                fontSize = 18.sp,
                            )
                        }
                    }
                }
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxHeight(0.26f)
            .fillMaxWidth()
            .clickable { }) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                Modifier
                    .padding(end = 33.dp)
                    .size(55.dp)
                    .background(color = Color(0xFFFcc5906), CircleShape)
                    .clip(CircleShape)

                    .padding(7.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.camera_white),
                    null,
                    Modifier
                        .size(55.dp)
                        .fillMaxSize()
                )
            }
        }
    }
}

@Preview
@Composable
fun SelegramAppSpark1Theme() {
    SettingsTg(
        user = UserData(
            UsFirstName = "Alex",
            UsPhoneNumber = "+ 7 963 132 83 90",
            UsLastName = "Mas0n",
            UsDiscription = "Fucking Woods",
            UsNickName = "@Mas0nchik",
        )
    )
}
