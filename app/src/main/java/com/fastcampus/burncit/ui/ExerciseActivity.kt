package com.fastcampus.burncit.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fastcampus.burncit.R
import com.fastcampus.burncit.databinding.ActivityExerciseBinding
import org.koin.android.viewmodel.ext.android.viewModel

class ExerciseActivity : AppCompatActivity() {
    val exerciseViewModel: ExerciseViewModel by viewModel()
    lateinit var activityExerciseBinding: ActivityExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityExerciseBinding = ActivityExerciseBinding.inflate(layoutInflater)
    }
}