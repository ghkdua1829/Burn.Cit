package com.fastcampus.burncit.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fastcampus.burncit.R
import org.koin.android.viewmodel.ext.android.viewModel

class ExerciseActivity : AppCompatActivity() {
    val exerciseViewModel: ExerciseViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
    }
}