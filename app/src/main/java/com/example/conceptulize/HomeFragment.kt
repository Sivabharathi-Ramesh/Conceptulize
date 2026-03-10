package com.example.conceptulize

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvFeatured: RecyclerView = view.findViewById(R.id.rvFeatured)

        // 1. Create a list of dummy data for your subjects
        val lessons = listOf(
            Lesson("Organic Compounds", "CHEMISTRY", R.drawable.logo),
            Lesson("Calculus: Integrals", "MATHEMATICS", R.drawable.logo),
            Lesson("Quantum Mechanics", "PHYSICS", R.drawable.logo)
        )

        // 2. Set up the LayoutManager as Horizontal
        rvFeatured.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        // 3. Attach the Adapter
        rvFeatured.adapter = LessonAdapter(lessons)
    }
}