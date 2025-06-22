package com.example.telegramappspark_1.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R


@Preview
@Composable
fun ChatsScreen() {
    var showr by remember { mutableStateOf(false) }
    var showak by remember { mutableStateOf(false) }
    val alpha by animateFloatAsState(
        targetValue = if (showr) 1f else 0f, animationSpec = tween(300)
    )
    val ofsetx by animateFloatAsState(
        targetValue = if (showr) 0f else -200f, animationSpec = tween(300)
    )



    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable { showr = false }
            .pointerInput(Unit) {
                detectHorizontalDragGestures { change, dragAmount ->
                    if ((dragAmount > 20) && (!showr)) {
                        showr = true
                    } else if ((dragAmount < -20) && (showr)) {
                        showr = false
                    }
                }

            }) {

        Box(
            Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        Pair(0f, Color(0xFFFcc5906)), Pair(1f, Color(0xFFF00000))
                    )
                )
        ) {}
        Column() {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Box(
                    Modifier
                        .clickable { showr = true }
                        .padding(5.dp)) {
                    Image(
                        painter = painterResource(R.drawable.settings_white),
                        null,modifier=Modifier.size(37.dp)
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
                        painter = painterResource(R.drawable.loupe), null
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
                        focusedIndicatorColor = Color.Transparent
                    )

                )
            }


        }
        if (alpha > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Black.copy(alpha = 0.5f * alpha))
            )
        }
        if (showr) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .offset(x = ofsetx.dp)
                    .fillMaxHeight()
                    .clickable { }) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .background(color = Color(0xFF202a36))
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight(0.2f)
                            .background(color = Color(0xFF283545))
                    ) {
                        Column() {
                            Row() {
                                Image(
                                    painter = painterResource(R.drawable.moon), null,
                                    modifier = Modifier
                                        .padding(start = 16.dp, top = 24.dp)
                                        .clip(CircleShape)
                                        .size(75.dp)
                                        .clickable { }
                                )
                                Row(
                                    horizontalArrangement = Arrangement.End,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.sun_1), null,
                                        modifier = Modifier
                                            .padding(top = 18.dp, end = 10.dp)
                                            .clickable { }
                                            .size(30.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight().clickable {showak=!showak}
                                    .fillMaxSize()

                            )
                            {
                                Column {
                                    Text(
                                        "Ajgiz",
                                        color = Color.White,
                                        fontSize = 18.sp,fontWeight = FontWeight.SemiBold,
                                        modifier = Modifier.padding(start = 16.dp)
                                    )
                                    Text(
                                        "+7 967 747 27 37",
                                        color = Color.Gray,
                                        fontSize = 13.sp,
                                        modifier = Modifier.padding(top = 8.dp, start = 16.dp)
                                    )
                                }

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth(), horizontalArrangement = Arrangement.End
                                    ) {
                                        if (showak){
                                        Image(
                                            painter = painterResource(R.drawable.chevron_down), null,
                                            modifier = Modifier
                                                .padding(top = 7.dp, end = 10.dp)
                                                .clickable {showak =!showak}
                                                .size(30.dp)
                                        )
                                    }
                                        else if (!showak){Image(
                                            painter = painterResource(R.drawable.chevron_up), null,
                                            modifier = Modifier
                                                .padding(top = 7.dp, end = 10.dp)
                                                .clickable {showak=!showak }
                                                .size(30.dp)
                                        )
                                        }
                                    }

                            }

                        }
                    }
                    LazyColumn(modifier = Modifier.fillMaxHeight()) {
                        item {
                            if (showak){
                                Row(
                                    modifier = Modifier
                                        .clickable { }
                                        .fillMaxWidth()
                                        .padding(top = 22.dp, start = 16.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.moon),
                                        contentDescription = "Профиль",
                                        modifier = Modifier
                                            .size(30.dp)
                                            .padding()
                                            .clip(CircleShape)
                                    )
                                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                    Text(
                                        "Mason",
                                        color = Color.White,
                                        fontSize = 16.sp,fontWeight = FontWeight.Medium,
                                        modifier = Modifier.padding(start = 15.dp)
                                    )
                                }


                                Row(
                                    modifier = Modifier
                                        .clickable { }
                                        .fillMaxWidth()
                                        .padding(top = 22.dp, start = 16.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.plus),
                                        contentDescription = "Профиль",
                                        modifier = Modifier
                                            .size(30.dp)
                                            .padding()
                                    )
                                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                    Text(
                                        "Добавить аккаунт",
                                        color = Color.White,
                                        fontSize = 16.sp,fontWeight = FontWeight.Medium,
                                        modifier = Modifier.padding(start = 15.dp)
                                    )
                                }


                            }
                        }
                        item {
                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp),
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
                                    "Мой профиль",
                                    color = Color.White,
                                    fontSize = 16.sp,fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.wallet),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Кошелёк",
                                    color = Color.White,
                                    fontSize = 16.sp,fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }
                            Box(modifier = Modifier.padding(top = 7.dp,)) {
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
                                    .padding(top = 10.dp, start = 16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.users),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Создать группу",
                                    color = Color.White,
                                    fontSize = 16.sp,fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.person_outline),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Контакты",
                                    color = Color.White,fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.phone),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Звонки",
                                    color = Color.White,fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.bookmark_1),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Избранное",
                                    color = Color.White,
                                    fontSize = 16.sp,fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp, bottom = 10.dp),
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
                                    "Настройки",
                                    color = Color.White,
                                     fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
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
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.user_plus_1),
                                    contentDescription = "Профиль",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding()
                                )
                                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                                Text(
                                    "Пригласить друзей",
                                    color = Color.White,fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .clickable { }
                                    .fillMaxWidth()
                                    .padding(top = 22.dp, start = 16.dp),
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
                                    "Возможности SparkGram",
                                    color = Color.White,fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                        }
                    }

                }
            }
        }
    }
}