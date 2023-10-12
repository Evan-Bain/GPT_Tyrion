package com.example.gpt_tyrion.open_ai

import android.content.pm.ApplicationInfo
import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.chat.*
import com.aallam.openai.api.model.ModelId
import com.aallam.openai.client.OpenAI
import kotlinx.coroutines.flow.Flow

class TestUse(appInfo: ApplicationInfo) {

    //NOTE: ADD NULL SAFETY
    //TODO: OBTAIN API KEY FROM OPENAI
    // INSERT API KEY HERE
    /*API KEY --> */ private val apiKey: String = "INSERT YOUR API KEY HERE" //<-- API KEY
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