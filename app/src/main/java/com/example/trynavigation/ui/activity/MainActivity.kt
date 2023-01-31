package com.example.trynavigation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.trynavigation.R
import com.example.trynavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpNavigation()
    }

    private fun setUpNavigation() {
        val NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_graph_xml) as NavHostFragment
        val navController = NavHostFragment.navController

        binding.bottomNavigation.setupWithNavController(navController)
    }
}