package com.example.telegramappspark_1.ui

import com.example.telegramappspark_1.R

data class UserData(
    var UsFirstName:String,
    var UsLastName:String = "",
    var UsNickName:String = "Не задано",
    val UsPhoneNumber:String,
    var UsDateOfBirthday:String?=null,
    var UsPersonalChannel:String?=null,
    var UsDiscription:String="О себе",
    var UsImageResId: Int = R.drawable.moon
    )

