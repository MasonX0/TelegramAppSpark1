package com.example.telegramappspark_1.ui

data class ChatState(
    val imgLink: Int,
    val chatName: String,
    val isMuted: Boolean = false,
    val lastMessageAuthor: String?,
    val chatLastMessage: String,
    val messageState : MessageState?,
    val date: String,
    val isPinned: Boolean = false,
    val numberOfUnreadMessages: String?
)
