package ru.cursor.question.models

import com.google.gson.annotations.SerializedName

data class Answer(
    @SerializedName("text") val text: String,
    @SerializedName("points") val points : Int
)