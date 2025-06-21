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
    {   var userdisrcby by remember { mutableStateOf(user.UsDiscription?:"")  }
        var userfirstname by remember { mutableStateOf(user.UsFirstName) }
        var userlastname by remember { mutableStateOf(user.UsLastName) }
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
                                    user.UsFirstName = it
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
                                    user.UsLastName = it
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

                   Column {   Text(
                        "Настройки",
                        color = Color(0xFF368CCC),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp)
                    )
                       Row(modifier = Modifier.clickable {  }.padding(bottom = 10.dp))  {Text(
                           "Личный канал",
                           color = Color.White,
                           fontSize = 18.sp,
                           fontWeight = FontWeight.Medium,
                           modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp))
                           Row (modifier = Modifier.fillMaxWidth().padding(end = 10.dp)
                               , horizontalArrangement = Arrangement.End) {
                               if (user.UsPersonalChannel!=null){
                                   Text(
                                       user.UsPersonalChannel!!.UsPersonalChannelName!!,
                                       color = Color(0xFF368CCC),
                                       fontSize = 18.sp,
                                       fontWeight = FontWeight.Normal,
                                       modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp))

                               }
                            else if (user.UsPersonalChannel==null){
                                   Text(
                                       "Добавить",
                                       color = Color(0xFF368CCC),
                                       fontSize = 18.sp,
                                       fontWeight = FontWeight.Normal,
                                       modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 7.dp))

                               }



                           }
                   }}}
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
                            Row  (modifier = Modifier.clickable {  }, verticalAlignment = Alignment.CenterVertically) {
                                OutlinedTextField(
                                    value = userdisrcby!!,
                                    textStyle = TextStyle(fontSize = 18.sp, color = Color.White),
                                    onValueChange = {
                                        userdisrcby = it
                                        user.UsDiscription = it
                                    },
                                    placeholder = { Text("Напишите что-нибудь о себе...") },
                                    modifier =
                                        Modifier
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
                                Row(modifier = Modifier.fillMaxSize(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.End){
                                    Text("${60-userdisrcby.length}",fontSize = 18.sp, modifier = Modifier.padding(end = 17.dp),color = Color.Gray)
                                }}

                        }



                    }


                }

                Spacer(modifier = Modifier.padding(vertical = 6.dp))
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

}

@Preview
@Composable
fun Selegr2amAppSpark1Theme() {
    EditPr(
        user = UserData(
            UsFirstName = "Alex",
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
                ))
    )
}
