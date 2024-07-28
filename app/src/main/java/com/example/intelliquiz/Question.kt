package com.example.intelliquiz

data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswer: String
)