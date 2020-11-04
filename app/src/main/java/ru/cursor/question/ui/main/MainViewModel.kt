package ru.cursor.question.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.cursor.question.models.Answer
import ru.cursor.question.models.Poll
import ru.cursor.question.models.Question

class MainViewModel : ViewModel() {
    private val _list = MutableLiveData<List<Poll>>().apply {
        value = getPollOne()
    }

    fun getPollOne():List<Poll> {
        val result = ArrayList<Poll>()
        result.add(Poll("Тест по информатике", getQuestions1()))
        result.add(Poll("Тест по математике ", getQuestions2()))
        return result
    }
    fun getQuestions1():List<Question> {
        val oneTest = ArrayList<Question>()
        oneTest.add(Question("Что такое переменная", getAnswers11()))
        oneTest.add(Question("Что такое константа", getAnswers12()))
        return oneTest
    }

    fun getQuestions2():List<Question> {
        val oneTest = ArrayList<Question>()
        oneTest.add(Question("Что такое минус", getAnswers11()))
        return oneTest
    }

    fun getAnswers11():List<Answer> {
        val oneAnswers = ArrayList<Answer>()
        oneAnswers.add(Answer("Кто-то на перемене", 0))
        oneAnswers.add(Answer("Второй ответ", 0))
        oneAnswers.add(Answer("Третий ответ", 0))
        oneAnswers.add(Answer("Правильный ответ", 1))
        return oneAnswers
    }

    fun getAnswers12():List<Answer> {
        val oneAnswers = ArrayList<Answer>()
        oneAnswers.add(Answer("Это переменная", 0))
        oneAnswers.add(Answer("Это функция", 0))
        oneAnswers.add(Answer("Это монада", 0))
        oneAnswers.add(Answer("Правильный ответ", 1))
        return oneAnswers
    }

    val polls: LiveData<List<Poll>> = _list

}