package com.example.intelliquiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProgrammingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programming)

        val title = intent.getStringExtra("title")
        val subtitle = intent.getStringExtra("subtitle")
        val time = intent.getStringExtra("time")

    }
}
