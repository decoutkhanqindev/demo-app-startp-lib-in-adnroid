package com.example.demoappstartplibinadnroid.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoappstartplibinadnroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private val binding: ActivityMainBinding by lazy {
    ActivityMainBinding.inflate(layoutInflater)
  }
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
  }
}