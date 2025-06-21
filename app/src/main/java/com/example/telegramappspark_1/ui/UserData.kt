package com.example.telegramappspark_1.ui

import com.example.telegramappspark_1.R

data class UserData(
    var UsFirstName:String,
    var UsLastName:String = "",
    var UsNickName:String? = null,
    val UsPhoneNumber:String,
    var UsDateOfBirthday:String?=null,
    var UsDiscription:String?=null,
    var UsImageResId: Int = R.drawable.moon,
    var UsPersonalChannel:UsChannel?=null,
    )

data class UsChannel(
    var UsPersonalChannelImageId: Int? = R.drawable.avatar,
    var UsPersonalChannelSubsCount:Int? =0,
    var UsPersonalChannelLastSms:String = "Последнее смс",
    var DayOfLastMassage:String?="Пн",
    var LastMassageIsRead:Boolean=false,
    var UsPersonalChannelName:String?=null,

)