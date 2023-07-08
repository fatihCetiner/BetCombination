package com.example.betcombination.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.betcombination.R
import com.example.betcombination.databinding.ActivityMainBinding
import com.example.betcombination.presentation.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (savedInstanceState == null) {
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
        }
    }
}