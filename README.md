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
1. Navigate to file: local.properties", located at ..\GPT_Tyrion\local.properties
2. Add: `openaiKey = [YOUR_API_KEY]`
3. Navigate to app's build.gradle file: "build.gradle", located at: ..\GPT_Tyrion\app\build.gradle (Module :app)
4. Complete both TODOs: `TODO: Uncomment code`
   
   `/*def localProperties = new Properties()
      localProperties.load(new FileInputStream(rootProject.file("local.properties")))*/`
   
   `//resValue("string", "openai_key", localProperties['openaiKey'])`
         
6. Rebuild project
7. Run project in debug mode to use API key

WITHOUT API KEY SECURITY
--------------------------------------------------------------------------------------------------
1. Navigate to file "TestUse.kt", located at: ..\GPT_Tyrion\app\src\main\java\com\example\gpt_tyrion\open_ai\TestUse.kt
2. Replace value of "apiKey" to [YOUR_API_KEY]
   
   Before: `private val apiKey: String = context.getString(R.string.openai_key)`
   
   After: `private val apiKey: String = "[YOUR_API_KEY]"`
