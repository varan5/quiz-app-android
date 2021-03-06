package com.example.quizapp

// this file is the blueprint or the format of a single question, in other words it is the object of a question

data class Question (
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)