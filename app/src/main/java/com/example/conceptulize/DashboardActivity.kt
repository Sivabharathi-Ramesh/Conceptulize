package com.example.conceptulize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // 1. Find the Bottom Navigation View
        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // 2. Find the Navigation Host Fragment safely
        // Since you used FragmentContainerView, we find it via SupportFragmentManager
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        // 3. Get the Controller from the Host
        val navController = navHostFragment.navController

        // 4. Link them together
        navView.setupWithNavController(navController)
    }
}