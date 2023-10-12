# GPT_Tyrion
A basic implementation of the GPT API

- Currently uses GPT model: "GPT-3.5-turbo", which specializes in conversation.
- Tyrion does not remember previous messages/conversations.
- Tyrion will only respond to input recently given.

SETUP:
--------------------------------------------------------------------------------------------------
Obtain API KEY from OpenAI: https://platform.openai.com/account/api-keys.

- Open with Android Studio.
- Display in "Project" view.

WITH API KEY SECURITY
--------------------------------------------------------------------------------------------------
- Naviagate to generated file: local.properties", located at ..\GPT_Tyrion\local.properties
- Add: openaiKey = [YOUR_API_KEY]
-     openaiKey = sk-FsdfjksBdfsfGdsfsdGjsnwojncbYUERh
- Rebuild project
- Run project in debug mode to use API key

WITHOUT API KEY SECURITY
--------------------------------------------------------------------------------------------------
- Navigate to file "TestUse.kt", located at: ..\GPT_Tyrion\app\src\main\java\com\example\gpt_tyrion\open_ai\TestUse.kt
- Replace value of "apiKey" to [YOUR_API_KEY]
- Before:
-     private val apiKey: String = context.getString(R.string.openai_key)
- After:
-     private val apiKey: String = "[YOUR_API_KEY]"
