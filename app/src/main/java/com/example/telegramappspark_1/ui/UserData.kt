package com.example.telegramappspark_1.ui

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.telegramappspark_1.R

data class UserData(
    var UsFirstName:String,
    var UsLastName:String?=null,
    var UsNickName:String="Не задано",
    val UsPhoneNumber:String,
    var UsDateOfBirthday:String?=null,
    var UsPersonalChannel:String?=null,
    var UsDiscription:String="О себе",
    var UsAvatar: Int = R.drawable.usav
    )


