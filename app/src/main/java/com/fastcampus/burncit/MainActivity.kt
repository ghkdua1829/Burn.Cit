package com.fastcampus.burncit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fastcampus.burncit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    }
}