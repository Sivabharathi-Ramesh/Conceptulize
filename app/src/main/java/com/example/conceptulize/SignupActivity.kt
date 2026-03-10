package com.example.conceptulize

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        // 1. Navigation to Login
        val tvSignIn = findViewById<TextView>(R.id.tvSignIn)
        tvSignIn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // 2. Grade Dropdown Setup
        val grades = arrayOf("Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5",
            "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10",
            "Grade 11", "Grade 12")
        val gradeAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, grades)
        val etGrade = findViewById<AutoCompleteTextView>(R.id.etGrade)
        etGrade.setAdapter(gradeAdapter)

        // 3. Stream Selection Logic (The "Smart" part)
        val menuStream = findViewById<View>(R.id.menuStream)
        val tvStreamLabel = findViewById<View>(R.id.tvStreamLabel)
        val etStream = findViewById<AutoCompleteTextView>(R.id.etStream)

        etGrade.setOnItemClickListener { _, _, position, _ ->
            val selectedGrade = grades[position]

            // Show stream only for 11 and 12
            if (selectedGrade == "Grade 11" || selectedGrade == "Grade 12") {
                tvStreamLabel.visibility = View.VISIBLE
                menuStream.visibility = View.VISIBLE

                // Set up stream options once visible
                val streams = arrayOf("Science", "Commerce", "Arts")
                val streamAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, streams)
                etStream.setAdapter(streamAdapter)
            } else {
                tvStreamLabel.visibility = View.GONE
                menuStream.visibility = View.GONE
            }
        }

        // 4. Create Account Button -> Go to Dashboard
        // Change this line:
        val btnCreateAccount = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnCreateAccount)
        btnCreateAccount.setOnClickListener {
            // We go to DashboardActivity because that's where your Fragments live
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish() // Prevents user from coming back to signup page
        }
    }
}