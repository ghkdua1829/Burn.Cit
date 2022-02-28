package com.fastcampus.burncit.ui.exercise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fastcampus.burncit.R
import com.fastcampus.burncit.databinding.ActivityExerciseBinding
import org.koin.android.viewmodel.ext.android.viewModel

class ExerciseActivity : AppCompatActivity() {
    val exerciseViewModel: ExerciseViewModel by viewModel()
    lateinit var activityExerciseBinding: ActivityExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityExerciseBinding = DataBindingUtil.setContentView(this, R.layout.activity_exercise)
    }
}