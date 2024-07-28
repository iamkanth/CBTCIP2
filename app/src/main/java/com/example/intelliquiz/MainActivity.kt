package com.example.intelliquiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.intelliquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), QuizAdapter.OnItemClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var quizModelList: MutableList<QuizModel>
    private lateinit var quizAdapter: QuizAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModelList = mutableListOf()
        getDataFromFirebase()

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        quizAdapter = QuizAdapter(quizModelList, this)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = quizAdapter
    }

    private fun getDataFromFirebase() {
        quizModelList.add(QuizModel("1", "Programming", "All the basic programming", "10 min"))
        quizModelList.add(QuizModel("2", "General Knowledge", "Let's Explore your Knowledge", "10 min"))
        quizModelList.add(QuizModel("3", "Geography", "Boost Your Geographic knowledge", "10 min"))
    }

    override fun onItemClick(quizModel: QuizModel) {
        val intent = when (quizModel.id) {
            "1" -> Intent(this, ProgrammingQuizActivity::class.java)
            "2" -> Intent(this, GeneralKnowledgeQuizActivity::class.java)
            "3" -> Intent(this, GeographyQuizActivity::class.java)
            else -> null
        }

        intent?.apply {
            putExtra("title", quizModel.title)
            putExtra("subtitle", quizModel.subtitle)
            putExtra("time", quizModel.time)
        }

        startActivity(intent)
    }
}
