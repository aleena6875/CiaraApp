package com.example.ciaraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.fragment.NavHostFragment
import com.example.ciaraapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)

        //val navHostFragment =
        supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        //val navController = navHostFragment.navController

    }
}