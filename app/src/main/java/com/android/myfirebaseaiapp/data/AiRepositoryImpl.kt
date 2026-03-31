package com.android.myfirebaseaiapp.data

import com.google.firebase.FirebaseApp
import com.google.firebase.vertexai.FirebaseVertexAI
import com.google.firebase.vertexai.GenerativeModel
import javax.inject.Inject

class AiRepositoryImpl @Inject constructor(
    private val firebaseApp: FirebaseApp
) : AiRepository {

    override suspend fun generateText(prompt: String): String {

        /* val vertexAi = FirebaseVertexAI.getInstance(firebaseApp)
         val model = vertexAi.generativeModel("gemini-1.5-flash")
         val response = model.generateContent(prompt)*/

        return "Response for prompt: \"$prompt\""
    }
}