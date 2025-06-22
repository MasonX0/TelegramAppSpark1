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
fun Profile(user: UserData) {
    Box()
    {    var puble by remember { mutableStateOf(true) }
        var showQn by remember { mutableStateOf(false) }
        var showPopup by remember { mutableStateOf(false) }
        val alpha by animateFloatAsState(
            targetValue = if (showPopup or showQn) 1f else 0f,
            animationSpec = tween(durationMillis = 300)
        )
        val offsetX by animateFloatAsState(
            targetValue = if (showPopup) 0f else -20f,
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

            }
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
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                    ) {
                        IconButton(
                            onClick = {}, modifier = Modifier
                                .padding(start = 10.dp, top = 12.dp, end = 4.dp)
                                .size(28.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.editka),
                                null,
                                Modifier.fillMaxSize()
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


            }
            item {
                if (user.UsPersonalChannel != null) {
                    Box(
                        modifier = Modifier.background(color = Color(0xFF202a36))
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .fillMaxWidth()
                        ) {
                            Row() {
                                Text(
                                    "Канал",
                                    color = Color(0xFF368CCC),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 7.dp, start = 9.dp)
                                )

                                Spacer(modifier = Modifier.padding(horizontal = 7.dp))

                                Text(
                                    "${user.UsPersonalChannel!!.UsPersonalChannelSubsCount} подписчика",
                                    color = Color(0xFF368CCC),
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier
                                        .padding(top = 10.dp)
                                        .background(color = Color(0xFF368CCC).copy(alpha = 0.2f))
                                )
                            }
                            Row(modifier = Modifier.fillMaxSize()) {
                                Box(
                                    modifier = Modifier
                                        .size(60.dp)
                                        .padding(top = 7.dp)
                                        .clip(CircleShape)
                                        .clickable {}
                                        .background(Color.Gray)) {
                                    Image(
                                        painter = painterResource(user.UsPersonalChannel!!.UsPersonalChannelImageId!!),
                                        contentDescription = "Профиль",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop

                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .padding(start = 8.dp, top = 8.dp)
                                        .fillMaxSize()
                                ) {
                                    Row {
                                        Text(
                                            "${user.UsPersonalChannel!!.UsPersonalChannelName}",
                                            color = Color.White,
                                            fontSize = 18.sp
                                        )
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(end = 10.dp),
                                            horizontalArrangement = Arrangement.End
                                        )
                                        {
                                            if (user.UsPersonalChannel!!.LastMassageIsRead) {
                                                Image(
                                                    painter = painterResource(R.drawable.read),
                                                    contentDescription = "Профиль",
                                                    modifier = Modifier
                                                        .size(22.dp)
                                                        .padding()
                                                )
                                            } else {
                                                Image(
                                                    painter = painterResource(R.drawable.notread),
                                                    contentDescription = "Профиль",
                                                    modifier = Modifier
                                                        .size(22.dp)
                                                        .padding()
                                                )
                                            }
                                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                            Text(
                                                "${user.UsPersonalChannel!!.DayOfLastMassage}",
                                                color = Color.Gray,
                                                fontSize = 15.sp,
                                                modifier = Modifier.padding(
                                                    start = 10.dp,
                                                    top = 4.dp
                                                )
                                            )
                                        }
                                    }
                                    Text(
                                        "${user.UsPersonalChannel!!.UsPersonalChannelLastSms}",
                                        color = Color.Gray,
                                        modifier = Modifier
                                            .padding(top = 2.dp)
                                            .fillMaxWidth()
                                            .fillMaxHeight(0.1f)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.padding(vertical = 6.dp))

                        }
                    }
                }
            }
            item {
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
                            "Информация", color = Color(0xFF368CCC),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)
                        )
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
                            .fillMaxWidth().clickable { }
                    ) {
                        Box(modifier = Modifier) {
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
                        if (user.UsNickName != null) {


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
                                }

                            }
                        }
                        if (user.UsDiscription != null) {
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
                                    Text(
                                        text = user.UsDiscription!!,
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
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))

                    }


                }

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Box(modifier = Modifier.clickable {puble=true }){
                        Text(
                            "Публикации",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier

                                .padding(top = 15.dp, start = 29.dp, bottom = 7.dp)
                        )}
                        Spacer(modifier = Modifier)
                        Text(
                            "Архив публикаций",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .clickable { puble = false }
                                .padding(top = 15.dp, start = 29.dp, bottom = 7.dp)
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
            }
            item {
                if (puble) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .background(color = Color(0xFF202a36))
                    ) {
                        Column(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(top = 90.dp, bottom = 110.dp)
                        ) {
                            Text(
                                "Публикаций пока нет...",
                                color = Color.White,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 70.dp)
                            )
                            Text(
                                "Публикуйте фотографии и видео в своём профиле",
                                color = Color.Gray,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 10.dp)
                            )

                        }

                    }

                }
                else if (!puble) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .background(color = Color(0xFF202a36))
                    ) {
                        Column(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(top = 90.dp, bottom = 110.dp)
                        ) {
                            Text(
                                "Историй пока нет...",
                                color = Color.White,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 70.dp)
                            )
                            Text(
                                "Загрузите новую историю - она появится здесь",
                                color = Color.Gray,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 10.dp)
                            )

                        }

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
                        .padding(top = 40.dp, start = 90.dp, end = 10.dp)
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
                                modifier = Modifier.padding(start = 14.dp)
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
                                painter = painterResource(R.drawable.camera),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Выбрать фотографию",
                                color = Color.White,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 14.dp)
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
                                painter = painterResource(R.drawable.at_sign),
                                contentDescription = "Профиль",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding()
                            )
                            Spacer(modifier = Modifier.padding(vertical = 5.dp))
                            Text(
                                "Задать имя пользователя",
                                color = Color.White,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 14.dp)
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
fun SelegramAppSpark2Theme() {
    Profile(
        user = UserData(
            UsFirstName = "Alex",
            UsPhoneNumber = "+ 7 963 132 83 90",
            UsLastName = "Mas0n",

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
//кружок с фотиком
/*Box(
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
    }*/