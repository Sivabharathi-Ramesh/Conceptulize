package com.example.conceptulize

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        // Inside onCreate
        val loginLink = findViewById<TextView>(R.id.tvLoginLink)

        loginLink.setOnClickListener {
            // 1. Create the Intent (From current page -> To LoginActivity)
            val intent = Intent(this, LoginActivity::class.java)

            // 2. Start the new page
            startActivity(intent)

            // 3. Optional: Add a smooth "Vibe" transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        val getStarted = findViewById<Button>(R.id.btnGetStarted)

        getStarted.setOnClickListener {
            // 1. Create the Intent (From current page -> To LoginActivity)
            val intent = Intent(this, SignupActivity::class.java)

            // 2. Start the new page
            startActivity(intent)
        }
    }
}