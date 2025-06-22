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
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

//@Preview(heightDp = 1350)
@Composable
fun EditPr(user: UserData) {
    Box()


    {
        val months = listOf(
            "Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        )
        var currentUser by remember { mutableStateOf(user) }
        val days = (1..31).toList()
        val years = (1953..2024).toList()
        val daysState = rememberLazyListState(
            initialFirstVisibleItemIndex = Int.MAX_VALUE / 2
        )
        val monthsState = rememberLazyListState(
            initialFirstVisibleItemIndex = Int.MAX_VALUE / 2
        )
        val yearsState = rememberLazyListState(
            initialFirstVisibleItemIndex = Int.MAX_VALUE / 2
        )
        var userdisrcby by remember { mutableStateOf(user.UsDiscription ?: "") }
        var userfirstname by remember { mutableStateOf(user.UsFirstName) }
        var userlastname by remember { mutableStateOf(user.UsLastName) }
        var userdate by remember { mutableStateOf(user.UsDateOfBirthday ?: "") }
        var showQn by remember { mutableStateOf(false) }
        var showPopup by remember { mutableStateOf(false) }
        val alpha by animateFloatAsState(
            targetValue = if (showPopup or showQn) 1f else 0f,
            animationSpec = tween(durationMillis = 300)
        )


        val offsetY by animateFloatAsState(
            targetValue = if (showPopup) 0f else 100f,
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
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "Профиль",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 14.dp, start = 8.dp),
                            color = Color.White
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
                            .fillMaxWidth()
                    ) {
                        Text(
                            "Ваше имя", color = Color(0xFF368CCC),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)
                        )

                        Box(modifier = Modifier.clickable { }) {

                            OutlinedTextField(
                                value = userfirstname,
                                textStyle = TextStyle(fontSize = 18.sp, color = Color.White),
                                onValueChange = {
                                    userfirstname = it
                                    currentUser.UsFirstName = it
                                },
                                placeholder = { Text("Имя") },
                                modifier =
                                    Modifier
                                        .fillMaxWidth()

                                        .offset(x = (-16).dp)
                                        .background(color = Color.Transparent),
                                colors = androidx.compose.material3.TextFieldDefaults.colors(
                                    unfocusedContainerColor = Color.Transparent,
                                    focusedContainerColor = Color.Transparent,
                                    unfocusedTextColor = Color.White,
                                    focusedTextColor = Color.White,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedPlaceholderColor = Color.Gray,
                                    focusedPlaceholderColor = Color.Gray,
                                )
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
                        Box(modifier = Modifier.clickable { }) {

                            OutlinedTextField(
                                value = userlastname,
                                textStyle = TextStyle(fontSize = 18.sp, color = Color.White),
                                onValueChange = {
                                    userlastname = it
                                    currentUser.UsLastName = it
                                },
                                placeholder = { Text("Фамилия") },
                                modifier =
                                    Modifier
                                        .fillMaxWidth()

                                        .offset(x = (-16).dp)
                                        .background(color = Color.Transparent),
                                colors = androidx.compose.material3.TextFieldDefaults.colors(
                                    unfocusedContainerColor = Color.Transparent,
                                    focusedContainerColor = Color.Transparent,
                                    unfocusedTextColor = Color.White,
                                    focusedTextColor = Color.White,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedPlaceholderColor = Color.Gray,
                                    focusedPlaceholderColor = Color.Gray,
                                )
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

                    Column {
                        Text(
                            "Настройки",
                            color = Color(0xFF368CCC),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .padding(bottom = 10.dp)) {
                            Text(
                                "Личный канал",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(
                                    top = 15.dp,
                                    start = 20.dp,
                                    bottom = 7.dp
                                )
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 10.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (currentUser.UsPersonalChannel != null) {
                                    Text(
                                        currentUser.UsPersonalChannel!!.UsPersonalChannelName!!,
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(
                                            top = 15.dp,
                                            start = 20.dp,
                                            bottom = 7.dp
                                        )
                                    )

                                } else if (currentUser.UsPersonalChannel == null) {
                                    Text(
                                        "Добавить",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(
                                            top = 15.dp,
                                            start = 20.dp,
                                            bottom = 7.dp
                                        )
                                    )

                                }


                            }
                        }
                    }
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
                            "Ваше имя", color = Color(0xFF368CCC),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)
                        )

                        Box(modifier = Modifier.clickable { }) {
                            Row(
                                modifier = Modifier.clickable { },
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                OutlinedTextField(
                                    value = userdisrcby!!,
                                    textStyle = TextStyle(fontSize = 18.sp, color = Color.White),
                                    onValueChange = {
                                        if (it.length <= 60) {
                                            userdisrcby = it
                                            user.UsDiscription = it
                                        }
                                    },
                                    placeholder = { Text("Напишите что-нибудь о себе...") },
                                    modifier =
                                        Modifier
                                            .fillMaxWidth(0.8f)
                                            .offset(x = (-16).dp)
                                            .background(color = Color.Transparent),
                                    colors = androidx.compose.material3.TextFieldDefaults.colors(
                                        unfocusedContainerColor = Color.Transparent,
                                        focusedContainerColor = Color.Transparent,
                                        unfocusedTextColor = Color.White,
                                        focusedTextColor = Color.White,
                                        unfocusedIndicatorColor = Color.Transparent,
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedPlaceholderColor = Color.Gray,
                                        focusedPlaceholderColor = Color.Gray,
                                    )
                                )
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Text(
                                        "${60 - userdisrcby.length}",
                                        fontSize = 18.sp,
                                        modifier = Modifier.padding(end = 17.dp),
                                        color = if ((60 - userdisrcby.length) != 0) Color.Gray else Color.Red
                                    )
                                }
                            }

                        }


                    }


                }

                Spacer(modifier = Modifier.padding(vertical = 6.dp))

                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        "Вы можете добавить несколько строк о себе.", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "В", color = Color.Gray,
                            fontSize = 16.sp,
                        )
                        Text(
                            "настройках", color = Color(0xFF368CCC),
                            fontSize = 16.sp, modifier = Modifier
                                .padding(start = 5.dp)
                                .clickable { })
                        Text(
                            "можно выбрать,кому они будут ", color = Color.Gray,
                            fontSize = 16.sp, modifier = Modifier
                                .padding(start = 5.dp)
                        )

                    }
                    Text(
                        "видны.", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                }

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {

                    Column {
                        Text(
                            "Дата рождения",
                            color = Color(0xFF368CCC),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Row(
                            modifier = Modifier
                                .clickable { showPopup = true }
                                .padding(bottom = 10.dp)) {
                            Text(
                                "Дата вашего рождения",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(
                                    top = 15.dp,
                                    start = 20.dp,
                                    bottom = 7.dp
                                )
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 10.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (currentUser.UsDateOfBirthday != null) {
                                    Text(
                                        currentUser.UsDateOfBirthday!!,
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(
                                            top = 15.dp,
                                            start = 20.dp,
                                            bottom = 7.dp
                                        )
                                    )

                                } else if (currentUser.UsDateOfBirthday == null) {
                                    Text(
                                        "Указать",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(
                                            top = 15.dp,
                                            start = 20.dp,
                                            bottom = 7.dp
                                        )
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
                        if (currentUser.UsDateOfBirthday != null) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        currentUser = currentUser.copy(UsDateOfBirthday = null)
                                    }) {
                                Text(
                                    "Удалить дату рождения",
                                    color = Color.Red,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(
                                        top = 15.dp,
                                        start = 20.dp,
                                        bottom = 13.dp
                                    )
                                )
                            }


                        }


                    }
                }

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        "Ваш день рождения могут видеть только", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "контакты.", color = Color.Gray,
                            fontSize = 16.sp,
                        )
                        Text(
                            "Изменить >", color = Color(0xFF368CCC),
                            fontSize = 16.sp, modifier = Modifier
                                .padding(start = 5.dp)
                                .clickable { })

                    }

                }


                Spacer(modifier = Modifier.padding(vertical = 6.dp))
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
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .padding()
                        .offset(y = offsetY.dp)
                        .shadow(8.dp, RoundedCornerShape(8.dp))
                        .background(Color(0xFF2a3c52), RoundedCornerShape(8.dp))
                        .padding(8.dp)
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
                            Text(
                                "Дата рождения",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .weight(1f),
                                state = daysState
                            ) {

                                items(count = Int.MAX_VALUE) { index ->
                                    val day = days[index % days.size]
                                    Row(
                                        modifier = Modifier
                                            .padding(top = 10.dp, bottom = 10.dp)
                                            .fillMaxWidth(),
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Text(
                                            "$day",
                                            color = Color.White,
                                            fontSize = 15.sp,

                                            )
                                    }

                                }
                            }
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .weight(1f),
                                state = monthsState
                            ) {

                                items(count = Int.MAX_VALUE) { index ->
                                    val month = months[index % months.size]
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(top = 10.dp, bottom = 10.dp),
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Text(
                                            "$month",
                                            color = Color.White,
                                            fontSize = 15.sp,

                                            )
                                    }

                                }
                            }
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .weight(1f),
                                state = yearsState
                            ) {

                                items(count = Int.MAX_VALUE) { index ->
                                    val year = years[index % years.size]
                                    Row(
                                        modifier = Modifier
                                            .padding(top = 10.dp, bottom = 10.dp)
                                            .fillMaxWidth(),
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Text(
                                            "$year",
                                            color = Color.White,
                                            fontSize = 15.sp,

                                            )
                                    }

                                }
                            }
                        }

                    }
                }

            }
        }

    }

}

@Preview
@Composable
fun Selegr2amAppSpark1Theme() {
    EditPr(
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
