package com.fastcampus.burncit.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import com.fastcampus.burncit.data.datasource.local.AppDatabase
import com.fastcampus.burncit.data.repository.ExerciseRepository

class ExerciseViewModel(private val exerciseRepository: ExerciseRepository) : ViewModel() {
}