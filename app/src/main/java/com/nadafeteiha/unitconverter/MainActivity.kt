package com.nadafeteiha.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nadafeteiha.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.topAppBar)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}