package ru.cursor.question.models

import com.google.gson.annotations.SerializedName

data class Poll(
    @SerializedName("text") val text: String,
    @SerializedName("questions") val questions : List<Question>? = null
)