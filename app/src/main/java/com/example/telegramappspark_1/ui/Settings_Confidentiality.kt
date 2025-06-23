package com.example.telegramappspark_1.ui

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R

//@Preview(heightDp = 1350)
@Composable
fun Settings_Confidentiality(user: UserData) {
    Box()


    {
        val months = listOf(
            "Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        )
        var currentUser by remember { mutableStateOf(user) }
        var isConfCloudPassword by remember { mutableStateOf(false) }
        var isConfAutoDeleteMassages by remember { mutableStateOf(false) }
        var isConfCodePassword by remember { mutableStateOf(false) }
        var isConfContactsSynchronized by remember { mutableStateOf(false) }
        var isConfClueInSearch by remember { mutableStateOf(false) }
        var isConfBlackCount = 0
        var mok = "Все"
        var ConfDevisecCount = 1


        var always by remember { mutableStateOf(true) }
        var contakts by remember { mutableStateOf(false) }
        var nobody by remember { mutableStateOf(false) }

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
                            "Конфиденциалность",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 14.dp, start = 8.dp),
                            color = Color.White
                        )
                    }


                }
            }
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {

                    Column {
                        Text(
                            "Безопастность",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Row(
                            modifier = Modifier
                                .clickable { isConfCloudPassword = !isConfCloudPassword }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(R.drawable.rss),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Облачный пароль",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isConfCloudPassword) {
                                    Text(
                                        "Вкл",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(

                                            start = 20.dp,

                                            )
                                    )

                                } else if (!isConfCloudPassword) {
                                    Text(
                                        "Выкл",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(

                                            start = 20.dp,

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
                        Row(
                            modifier = Modifier
                                .clickable { isConfAutoDeleteMassages = !isConfAutoDeleteMassages }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(R.drawable.timer),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Автоудаление сообщений",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isConfAutoDeleteMassages) {
                                    Text(
                                        "Вкл",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(

                                            start = 20.dp,

                                            )
                                    )

                                } else if (!isConfAutoDeleteMassages) {
                                    Text(
                                        "Выкл",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(

                                            start = 20.dp,

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
                        Row(
                            modifier = Modifier
                                .clickable { isConfCodePassword = !isConfCodePassword }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(R.drawable.lock_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Код-пароль",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isConfCodePassword) {
                                    Text(
                                        "Вкл",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(

                                            start = 20.dp,

                                            )
                                    )

                                } else if (!isConfCodePassword) {
                                    Text(
                                        "Выкл",
                                        color = Color(0xFF368CCC),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        modifier = Modifier.padding(

                                            start = 20.dp,

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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(R.drawable.ban),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Черный список",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${isConfBlackCount}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(R.drawable.monitor_1),
                                contentDescription = "Профиль",
                                modifier = Modifier.size(30.dp)


                            )

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Устроства",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${ConfDevisecCount}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                }

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        "Просмотреть список устройств, на которых", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "Ваш аккаунт авторизован в приоложении", color = Color.Gray,
                            fontSize = 16.sp,
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "SparkGram.", color = Color.Gray,
                            fontSize = 16.sp,
                        )
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
                            "Конфидециальность",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Row(
                            modifier = Modifier
                                .clickable { isConfCloudPassword = !isConfCloudPassword }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Номер телефона",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { isConfAutoDeleteMassages = !isConfAutoDeleteMassages }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Время захода",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { isConfCodePassword = !isConfCodePassword }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Фотографии профиля",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Пересылка сообщений",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Звонки",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Голосовые сообщения",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Сообщения",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Дата рождения",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Подарки",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "О себе",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

                                        )
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
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 15.dp, start = 13.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Приглашения",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "${mok}",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

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
                        "Вы можете выбрать, кому разрешаете", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "приглашать Вас в группы и каналы.", color = Color.Gray,
                            fontSize = 16.sp,
                        )
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
                            "Уделить мой аккаунт",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .fillMaxWidth()
                                .padding(top = 20.dp, start = 13.dp, bottom = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Если я не захожу",
                                    color = Color.White,
                                    fontSize = 18.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    "18 месяцев",
                                    color = Color(0xFF368CCC),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    modifier = Modifier.padding(

                                        start = 20.dp,

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
                        "Если Вы ни разу не заглянете в SparkGram за это", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "время, аккаунт будет удалён вместе со всеми", color = Color.Gray,
                            fontSize = 16.sp,
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "сообщениями и контактами.", color = Color.Gray,
                            fontSize = 16.sp,
                        )
                    }

                }

            }
            item{
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF202a36))
                ) {

                    Column {
                        Text(
                            "Cекретные чаты",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )

                        Row(
                            modifier = Modifier
                                .clickable {  }
                                .fillMaxWidth()
                                .padding(top = 23.dp,bottom = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Удалить импортированные контакты",
                                    color = Color.White,
                                    fontSize = 17.sp, fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding()
                                )


                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {

                            }
                        }
                        Box(modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { isConfContactsSynchronized=!isConfContactsSynchronized }
                                .fillMaxWidth()
                                .padding(top = 10.dp,bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Сихнронизировать контакты",
                                    color = Color.White,
                                    fontSize = 17.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )


                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isConfContactsSynchronized == true) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        null, modifier = Modifier

                                    )
                                } else if (isConfContactsSynchronized == false) {
                                Image(
                                    painter = painterResource(R.drawable.switch_dark),
                                    null
                                )
                            }
                            }
                        }
                        Box(modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)) {
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(color = Color(0xFF182330))
                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { isConfClueInSearch=!isConfClueInSearch }
                                .fillMaxWidth()
                                .padding(top = 10.dp,bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            Column(modifier = Modifier.padding(start = 14.dp)) {
                                Text(
                                    "Подсказка людей при поиске",
                                    color = Color.White,
                                    fontSize = 17.sp, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding()
                                )


                            }

                            Row(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                if (isConfClueInSearch == true) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_notdark),
                                        null, modifier = Modifier

                                    )
                                } else if (isConfClueInSearch == false) {
                                    Image(
                                        painter = painterResource(R.drawable.switch_dark),
                                        null
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
                        "Показывать пользователей, которым Вы часто", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "пишите, вверху в разделе поиска", color = Color.Gray,
                            fontSize = 16.sp,
                        )
                    }
                    

                }
            }
        }
    }

}

@Preview(heightDp = 3000)
@Composable
fun Selegr2amAppSp23dark1Thgemsde() {
    Settings_Confidentiality(
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
