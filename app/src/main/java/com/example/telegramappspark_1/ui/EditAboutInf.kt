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
fun aboutDateEdit(user: UserData) {
    Box()


    {
        val months = listOf(
            "Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        )
        var currentUser by remember { mutableStateOf(user) }
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
                            "Дата рождения",
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
                            "Кто видит дату моего рождения?", color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)
                        )

                        Row(
                            modifier = Modifier
                                .clickable { always = true
                                contakts=false
                                nobody=false}
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Всегда скрывать",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(
                                    top = 15.dp,
                                    bottom = 7.dp
                                )
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(end = 20.dp, top = 5.dp),
                                horizontalArrangement = Arrangement.End,
                            )

                            {
                                if (always == true) {
                                    Image(
                                        painter = painterResource(R.drawable.check_circle_yes),
                                        null
                                    )
                                } else if (always == false) {
                                    Image(
                                        painter = painterResource(R.drawable.check_circle_not),
                                        null
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
                                .clickable { contakts = true
                                always=false
                                nobody=false}
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Контакты",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(
                                    top = 15.dp,
                                    bottom = 7.dp
                                )
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(end = 20.dp, top = 5.dp),
                                horizontalArrangement = Arrangement.End,
                            )

                            {
                                if (contakts == true) {
                                    Image(
                                        painter = painterResource(R.drawable.check_circle_yes),
                                        null
                                    )
                                } else if (contakts == false) {
                                    Image(
                                        painter = painterResource(R.drawable.check_circle_not),
                                        null
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
                        Row(modifier = Modifier
                            .clickable {
                                nobody = true
                                always=false
                            contakts=false}
                            .fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                "Никто",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(
                                    top = 15.dp,
                                    bottom = 13.dp
                                )
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(end = 20.dp, top = 5.dp),
                                horizontalArrangement = Arrangement.End,
                            )

                            {
                                if (nobody == true) {
                                    Image(
                                        painter = painterResource(R.drawable.check_circle_yes),
                                        null
                                    )
                                } else if (nobody == false) {
                                    Image(
                                        painter = painterResource(R.drawable.check_circle_not),
                                        null
                                    )
                                }

                            }

                        }


                    }


                }


                Spacer(modifier = Modifier.padding(vertical = 6.dp))


                Spacer(modifier = Modifier.padding(vertical = 6.dp))

                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        "Вы можете выбрать, кому разрешаете видеть ", color = Color.Gray,
                        fontSize = 16.sp,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "дату своего рождения. ", color = Color.Gray,
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
                            "Добавить исключения",
                            color = Color(0xFF368CCC),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                        )
                        Row(
                            modifier = Modifier
                                .clickable { }
                                .padding(bottom = 10.dp)) {
                            Text(
                                "Всегда скрывать",
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
                                .padding(bottom = 10.dp)) {
                            Text(
                                "Всегда запрещать",
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

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        "Вы можете добавить пользователей или целые", color = Color.Gray,
                        fontSize = 16.sp,
                    )


                        Text(
                            "группы в список исключений из настроек", color = Color.Gray,
                            fontSize = 16.sp,
                        )

                    Text(
                        "выше.", color = Color.Gray,
                        fontSize = 16.sp,
                    )
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
            }
        }
    }

}

@Preview
@Composable
fun Selegr2amAppSpdark1Thgeme() {
    aboutDateEdit(
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
