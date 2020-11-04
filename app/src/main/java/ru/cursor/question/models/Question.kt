package ru.cursor.question.models

import com.google.gson.annotations.SerializedName

data class Question(
    @SerializedName("text") val text: String,
    @SerializedName("answers") val answers : List<Answer>? = null
)