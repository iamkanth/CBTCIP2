package com.example.intelliquiz

object QuizData {
    val programmingQuestions = listOf(
        Question("What is Kotlin?", listOf("Language", "Framework", "IDE", "Library"), "Language"),
        Question("Which company developed Android?", listOf("Google", "Apple", "Microsoft", "Samsung"), "Google"),
        Question("What does IDE stand for?", listOf("Integrated Development Environment", "Internet Development Environment", "Intelligent Development Environment", "Internal Development Environment"), "Integrated Development Environment"),
        Question("What is a variable?", listOf("A constant value", "A storage location", "A function", "A loop"), "A storage location"),
        Question("What is the purpose of a constructor?", listOf("To create an object", "To define a function", "To initialize an object", "To create a class"), "To initialize an object")
    )

    val generalKnowledgeQuestions = listOf(
        Question("What is the capital of France?", listOf("Berlin", "Madrid", "Paris", "Lisbon"), "Paris"),
        Question("Who wrote 'Hamlet'?", listOf("Shakespeare", "Dickens", "Hemingway", "Austen"), "Shakespeare"),
        Question("What is the largest planet?", listOf("Earth", "Mars", "Jupiter", "Saturn"), "Jupiter"),
        Question("Who discovered gravity?", listOf("Newton", "Einstein", "Galileo", "Tesla"), "Newton"),
        Question("What is the boiling point of water?", listOf("90°C", "100°C", "110°C", "120°C"), "100°C")
    )

    val geographyQuestions = listOf(
        Question("Which is the largest continent?", listOf("Asia", "Africa", "Europe", "Australia"), "Asia"),
        Question("Which ocean is the deepest?", listOf("Atlantic", "Indian", "Arctic", "Pacific"), "Pacific"),
        Question("What is the longest river?", listOf("Amazon", "Nile", "Mississippi", "Yangtze"), "Nile"),
        Question("Which country has the largest population?", listOf("USA", "India", "China", "Russia"), "China"),
        Question("Which is the smallest country?", listOf("Monaco", "Vatican City", "San Marino", "Liechtenstein"), "Vatican City")
    )
}
