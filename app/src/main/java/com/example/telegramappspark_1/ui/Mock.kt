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
            date = "Fri",
            isPinned = true,
            numberOfUnreadMessages = null
        ),
        ChatState(
            imgLink = R.drawable.pixsellz_team,
            chatName = "Pixsellz Team",
            isMuted = false,
            lastMessageAuthor = "Hasan Web",
            chatLastMessage = "GIF",
            messageState = null,
            date = "9/29",
            isPinned = true,
            numberOfUnreadMessages = null
        ),
        ChatState(
            imgLink = R.drawable.joshua_lawrence,
            chatName = "Joshua Lawrence",
            isMuted = false,
            lastMessageAuthor = null,
            chatLastMessage = "Let's choose the first option",
            messageState = null,
            date = "Sun",
            isPinned = true,
            numberOfUnreadMessages = null
        ),
        ChatState(
            imgLink = R.drawable.telegram_designers,
            chatName = "Telegram Designers",
            isMuted = false,
            lastMessageAuthor = null,
            chatLastMessage = "GIF,Suggested by @alex_21",
            messageState = null,
            date = "10:42",
            isPinned = false,
            numberOfUnreadMessages = "17"
        ),
        ChatState(
            imgLink = R.drawable.alber_lasker,
            chatName = "Albert Lasker",
            isMuted = false,
            lastMessageAuthor = null,
            chatLastMessage = "Like your quote about a super idea!",
            messageState = null,
            date = "Mon ",
            isPinned = false,
            numberOfUnreadMessages = "2"
        ),

        ChatState(
            imgLink = R.drawable.figma_plugins,
            chatName = "Figma Plugins",
            isMuted = true,
            lastMessageAuthor = null,
            chatLastMessage = "\uD83D\uDC4B IOS 13 Design Kit.\n" +
                    "Turn your ideas into incredible wor…",
            messageState = null,
            date = "Sat",
            isPinned = false,
            numberOfUnreadMessages = "32"
        ),
        ChatState(
            imgLink = R.drawable.martha,
            chatName = "Martha",
            isMuted = false,
            lastMessageAuthor = null,
            chatLastMessage = "\uD83D\uDC4B Hi!",
            messageState = null,
            date = "11:03",
            isPinned = false,
            numberOfUnreadMessages = null
        ),
        ChatState(
            imgLink = R.drawable.jacob_w,
            chatName = "Jacob W.",
            isMuted = false,
            lastMessageAuthor = null,
            chatLastMessage = "I don't know",
            messageState = null,
            date = "19:38",
            isPinned = false,
            numberOfUnreadMessages = "11"
        ),

    )
)