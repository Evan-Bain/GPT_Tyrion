package com.example.gpt_tyrion.open_ai

import android.content.Context
import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.chat.ChatCompletion
import com.aallam.openai.api.chat.ChatCompletionRequest
import com.aallam.openai.api.chat.ChatMessage
import com.aallam.openai.api.chat.ChatRole
import com.aallam.openai.api.model.ModelId
import com.aallam.openai.client.OpenAI
import com.example.gpt_tyrion.R

class TestUse(context: Context) {

    //NOTE: ADD NULL SAFETY
    private val apiKey: String = context.getString(R.string.openai_key)
    private val openAI = OpenAI(apiKey)

    @OptIn(BetaOpenAI::class)
    suspend fun chatCompletion(userText: String): ChatCompletion {
        val chatCompletionRequest = ChatCompletionRequest(
            model = ModelId("gpt-3.5-turbo"), //AKA Chat GPT
            messages = listOf(
                ChatMessage(
                    role = ChatRole.User,
                    content = userText
                )
            )
        )

        //val completion: ChatCompletion = openAI.chatCompletion(chatCompletionRequest)

        return openAI.chatCompletion(chatCompletionRequest)
    }
}