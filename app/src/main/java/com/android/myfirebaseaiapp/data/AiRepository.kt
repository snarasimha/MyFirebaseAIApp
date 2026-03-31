package com.android.myfirebaseaiapp.data

interface AiRepository {
    suspend fun generateText(prompt: String): String
}