package com.example.conceptulize

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonAdapter(private val lessonList: List<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    class LessonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivLessonImage: ImageView = view.findViewById(R.id.ivLessonImage)
        val tvCategory: TextView = view.findViewById(R.id.tvCategory)
        val tvLessonTitle: TextView = view.findViewById(R.id.tvLessonTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_featured_lesson, parent, false)
        return LessonViewHolder(view)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = lessonList[position]
        holder.tvLessonTitle.text = lesson.title
        holder.tvCategory.text = lesson.category
        holder.ivLessonImage.setImageResource(lesson.imageRes)
    }

    override fun getItemCount(): Int = lessonList.size
}