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

            val intent = Intent(this, LoginActivity::class.java)


            startActivity(intent)


            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        val getStarted = findViewById<Button>(R.id.btnGetStarted)

        getStarted.setOnClickListener {

            val intent = Intent(this, SignupActivity::class.java)

            startActivity(intent)
        }
    }
}