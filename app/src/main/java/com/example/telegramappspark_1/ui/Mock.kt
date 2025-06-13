package com.example.telegramappspark_1.ui

import com.example.telegramappspark_1.R

val MockChatScreenState: ChatsScreenState = ChatsScreenState(
    chats = listOf(
        ChatState(
            imgLink = R.drawable.saved_messages,
            chatName = "Saved Messages",
            isMuted = false,
            lastMessageAuthor = null,
            chatLastMessage = "image.jpeg",
            messageState = null,
            date = "20.03",
            isPinned = false,
            numberOfUnreadMessages = null
        )
    )
)