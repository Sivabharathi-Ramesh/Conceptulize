package com.example.conceptulize

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val getStarted = findViewById<TextView>(R.id.tvSignIn)

        getStarted.setOnClickListener {
            // 1. Create the Intent (From current page -> To LoginActivity)
            val intent = Intent(this, LoginActivity::class.java)

            // 2. Start the new page
            startActivity(intent)
        }

            // 1. Define the grade options
            val items = arrayOf("Grades 1", "Grades 2 ", "Grades 3", "Grades 4", "Grades 5 ", "Grades 6","Grades 7", "Grades 8 ", "Grades 9", "Grades 10", "Grades 11 ", "Grades 12")

            // 2. Create the adapter
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

            // 3. Link it to the AutoCompleteTextView from your XML
            val etGrade = findViewById<AutoCompleteTextView>(R.id.etGrade)
            etGrade.setAdapter(adapter)
        }

    }

