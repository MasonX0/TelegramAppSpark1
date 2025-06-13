package com.example.telegramappspark_1.ui

sealed interface MessageState {
    object Sending: MessageState
    object Pending: MessageState
    object SentUnRead: MessageState
    object SentRead: MessageState
}
