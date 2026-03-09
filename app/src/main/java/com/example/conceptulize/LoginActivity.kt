package com.example.conceptulize

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val getStarted = findViewById<TextView>(R.id.joinnow)

        getStarted.setOnClickListener {
            // 1. Create the Intent (From current page -> To LoginActivity)
            val intent = Intent(this, SignupActivity::class.java)

            // 2. Start the new page
            startActivity(intent)

        }

        val forget = findViewById<TextView>(R.id.forgot)

        forget.setOnClickListener {
            // 1. Create the Intent (From current page -> To LoginActivity)
            val intent = Intent(this, ForgetpasswordActivity::class.java)

            // 2. Start the new page
            startActivity(intent)

        }

    }
}
