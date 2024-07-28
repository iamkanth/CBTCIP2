package com.example.intelliquiz

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.intelliquiz.databinding.RecyclerRowBinding

class QuizAdapter(private val quizList: List<QuizModel>, private val listener: OnItemClickListener) : RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(quizModel: QuizModel)
    }

    class QuizViewHolder(private val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(quizModel: QuizModel, listener: OnItemClickListener) {
            binding.quizTitleText.text = quizModel.title
            binding.quizSubtitleText.text = quizModel.subtitle
            binding.quizTimeText.text = quizModel.time
            binding.root.setOnClickListener {
                listener.onItemClick(quizModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QuizViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bind(quizList[position], listener)
    }

    override fun getItemCount() = quizList.size
}
