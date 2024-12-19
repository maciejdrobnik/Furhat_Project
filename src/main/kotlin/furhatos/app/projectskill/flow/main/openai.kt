package furhatos.app.projectskill.flow.main

import com.theokanning.openai.completion.CompletionRequest
import com.theokanning.openai.service.OpenAiService
import furhatos.flow.kotlin.DialogHistory
import furhatos.flow.kotlin.Furhat

val service = OpenAiService("sk-Ra9HBWFwXTZdfrRbviOTT3BIbkFJoxI44UxUTrKVDduil5h9")

fun getDialogCompletion(): String? {
    val agentName = "Robot"
    val description = "The following is a conversation between a $agentName and a Human. The $agentName is friendly and helpful."
    val contextWindowSize = 10
    val history = Furhat.dialogHistory.all.takeLast(contextWindowSize).mapNotNull {
        when (it) {
            is DialogHistory.ResponseItem -> {
                "Human: ${it.response.text}"
            }
            is DialogHistory.UtteranceItem -> {
                "$agentName: ${it.toText()}"
            }
            else -> null
        }
    }.joinToString(separator = "\n")
    val prompt = "$description\n\n$history\n$agentName:"
    val completionRequest = CompletionRequest.builder()
        .temperature(0.9)
        .maxTokens(50)
        .topP(1.0)
        .frequencyPenalty(0.0)
        .presencePenalty(0.6)
        .prompt(prompt)
        .stop(listOf("$agentName:", "Human:"))
        .echo(false)
        .model("gpt-3.5-turbo-instruct")
        .build();
    try {
        val completion = service.createCompletion(completionRequest).choices.first().text
        return completion.trim()
    } catch (e: Exception) {
        println("Problem with connection to OpenAI")
    }
    return null
}