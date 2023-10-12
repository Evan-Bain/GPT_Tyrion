# GPT_Tyrion
A basic implementation of the GPT API

- Currently uses GPT model: "GPT-3.5-turbo", which specializes in conversation.
- Implements OpenAI's official API recommendation for Kotlin compatibility: [openai-kotlin](https://github.com/aallam/openai-kotlin) by [Mouadd Aallam](https://github.com/aallam)
- Tyrion does not remember previous messages/conversations.
- Tyrion will only respond to input recently given.

SETUP:
--------------------------------------------------------------------------------------------------
Obtain API Key from OpenAI: [Click Here](https://platform.openai.com/account/api-keys)

- Open with Android Studio
- Display in "Project" view

WITH API KEY SECURITY
--------------------------------------------------------------------------------------------------
- Naviagate to generated file: local.properties", located at ..\GPT_Tyrion\local.properties
- Add: openaiKey = [YOUR_API_KEY]
  1.     openaiKey = sk-FsdfjksBdfsfGdsfsdGjsnwojncbYUERh
- Navigate to app's build.gradle file: "build.gradle", located at: ..\GPT_Tyrion\app\build.gradle (Module :app)
- Complete both TODOs:
  
  1.     //TODO: Uncomment code
         /*def localProperties = new Properties()
         localProperties.load(new FileInputStream(rootProject.file("local.properties")))*/
  2.     //TODO: Uncomment code
         //resValue("string", "openai_key", localProperties['openaiKey'])
- Rebuild project
- Run project in debug mode to use API key

WITHOUT API KEY SECURITY
--------------------------------------------------------------------------------------------------
- Navigate to file "TestUse.kt", located at: ..\GPT_Tyrion\app\src\main\java\com\example\gpt_tyrion\open_ai\TestUse.kt
- Replace value of "apiKey" to [YOUR_API_KEY]
- Before:
  1.     private val apiKey: String = context.getString(R.string.openai_key)
- After:
  1.     private val apiKey: String = "[YOUR_API_KEY]"
