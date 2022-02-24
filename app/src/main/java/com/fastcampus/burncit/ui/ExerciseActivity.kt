package com.fastcampus.burncit.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fastcampus.burncit.R

class ExerciseActivity : AppCompatActivity() {
    lateinit var exerciseViewModel: ExerciseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        exerciseViewModel = ExerciseViewModel(context = applicationContext)
    }
}