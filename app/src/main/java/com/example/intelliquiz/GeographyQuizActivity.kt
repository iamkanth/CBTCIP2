package com.example.intelliquiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intelliquiz.databinding.ActivityQuizBinding

class GeographyQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    private val questions = QuizData.geographyQuestions
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showQuestion()

        binding.nextButton.setOnClickListener {
            checkAnswer()
            if (currentQuestionIndex < questions.size - 1) {
                currentQuestionIndex++
                showQuestion()
            } else {
                showResult()
            }
        }
    }

    private fun showQuestion() {
        val question = questions[currentQuestionIndex]
        binding.questionText.text = question.question
        binding.option1.text = question.options[0]
        binding.option2.text = question.options[1]
        binding.option3.text = question.options[2]
        binding.option4.text = question.options[3]
        binding.radioGroup.clearCheck() // Clear previous selection
    }

    private fun checkAnswer() {
        val selectedOption = when (binding.radioGroup.checkedRadioButtonId) {
            binding.option1.id -> binding.option1.text.toString()
            binding.option2.id -> binding.option2.text.toString()
            binding.option3.id -> binding.option3.text.toString()
            binding.option4.id -> binding.option4.text.toString()
            else -> ""
        }
        if (selectedOption == questions[currentQuestionIndex].correctAnswer) {
            score++
        }
    }

    private fun showResult() {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("score", score)
        intent.putExtra("totalQuestions", questions.size)
        startActivity(intent)
        finish()
    }
}